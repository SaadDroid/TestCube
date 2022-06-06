public Volume attachVolumeToVM(final Long vmId, final Long volumeId, final Long deviceId) {
        final Account caller = CallContext.current().getCallingAccount();

        // Check that the volume ID is valid
        final VolumeInfo volumeToAttach = this.volFactory.getVolume(volumeId);
        // Check that the volume is a data volume
        if (volumeToAttach == null || !(volumeToAttach.getVolumeType() == VolumeType.DATADISK || volumeToAttach.getVolumeType() == VolumeType.ROOT)) {
            throw new InvalidParameterValueException("Please specify a volume with the valid type: " + VolumeType.ROOT.toString() + " or " + VolumeType.DATADISK.toString());
        }

        // Check that the volume is not currently attached to any VM
        if (volumeToAttach.getInstanceId() != null) {
            throw new InvalidParameterValueException("Please specify a volume that is not attached to any VM.");
        }

        // Check that the volume is not destroyed
        if (volumeToAttach.getState() == Volume.State.Destroy) {
            throw new InvalidParameterValueException("Please specify a volume that is not destroyed.");
        }

        // Check that the virtual machine ID is valid and it's a user vm
        final UserVmVO vm = this._userVmDao.findById(vmId);
        if (vm == null || vm.getType() != VirtualMachineType.User) {
            throw new InvalidParameterValueException("Please specify a valid User VM.");
        }

        // Check that the VM is in the correct state
        if (vm.getState() != State.Running && vm.getState() != State.Stopped) {
            throw new InvalidParameterValueException("Please specify a VM that is either running or stopped.");
        }

        // Check that the VM and the volume are in the same zone
        if (vm.getDataCenterId() != volumeToAttach.getDataCenterId()) {
            throw new InvalidParameterValueException("Please specify a VM that is in the same zone as the volume.");
        }

        // Check that the device ID is valid
        if (deviceId != null) {
            // validate ROOT volume type
            if (deviceId.longValue() == 0) {
                validateRootVolumeDetachAttach(this._volsDao.findById(volumeToAttach.getId()), vm);
                // vm shouldn't have any volume with deviceId 0
                if (!this._volsDao.findByInstanceAndDeviceId(vm.getId(), 0).isEmpty()) {
                    throw new InvalidParameterValueException("Vm already has root volume attached to it");
                }
                // volume can't be in Uploaded state
                if (volumeToAttach.getState() == Volume.State.Uploaded) {
                    throw new InvalidParameterValueException("No support for Root volume attach in state " + Volume.State.Uploaded);
                }
            }
        }

        // Check that the number of data volumes attached to VM is less than
        // that supported by hypervisor
        if (deviceId == null || deviceId.longValue() != 0) {
            final List<VolumeVO> existingDataVolumes = this._volsDao.findByInstanceAndType(vmId, VolumeType.DATADISK);
            final int maxDataVolumesSupported = getMaxDataVolumesSupported(vm);
            if (existingDataVolumes.size() >= maxDataVolumesSupported) {
                throw new InvalidParameterValueException("The specified VM already has the maximum number of data disks (" + maxDataVolumesSupported + "). Please specify another" +
                        " VM.");
            }
        }

        // if target VM has associated VM snapshots
        final List<VMSnapshotVO> vmSnapshots = this._vmSnapshotDao.findByVm(vmId);
        if (vmSnapshots.size() > 0) {
            throw new InvalidParameterValueException("Unable to attach volume, please specify a VM that does not have VM snapshots");
        }

        // permission check
        this._accountMgr.checkAccess(caller, null, true, volumeToAttach, vm);

        if (!(Volume.State.Allocated.equals(volumeToAttach.getState()) || Volume.State.Ready.equals(volumeToAttach.getState()) || Volume.State.Uploaded.equals(volumeToAttach
                .getState()))) {
            throw new InvalidParameterValueException("Volume state must be in Allocated, Ready or in Uploaded state");
        }

        final Account owner = this._accountDao.findById(volumeToAttach.getAccountId());

        if (!(volumeToAttach.getState() == Volume.State.Allocated || volumeToAttach.getState() == Volume.State.Ready)) {
            try {
                this._resourceLimitMgr.checkResourceLimit(owner, ResourceType.primary_storage, volumeToAttach.getSize());
            } catch (final ResourceAllocationException e) {
                s_logger.error("primary storage resource limit check failed", e);
                throw new InvalidParameterValueException(e.getMessage());
            }
        }

        final HypervisorType rootDiskHyperType = vm.getHypervisorType();
        final HypervisorType volumeToAttachHyperType = this._volsDao.getHypervisorType(volumeToAttach.getId());

        final StoragePoolVO volumeToAttachStoragePool = this._storagePoolDao.findById(volumeToAttach.getPoolId());

        // managed storage can be used for different types of hypervisors
        // only perform this check if the volume's storage pool is not null and not managed
        if (volumeToAttachStoragePool != null && !volumeToAttachStoragePool.isManaged()) {
            if (volumeToAttachHyperType != HypervisorType.None && rootDiskHyperType != volumeToAttachHyperType) {
                throw new InvalidParameterValueException("Can't attach a volume created by: " + volumeToAttachHyperType + " to a " + rootDiskHyperType + " vm");
            }
        }

        final AsyncJobExecutionContext asyncExecutionContext = AsyncJobExecutionContext.getCurrentExecutionContext();

        if (asyncExecutionContext != null) {
            final AsyncJob job = asyncExecutionContext.getJob();

            if (s_logger.isInfoEnabled()) {
                s_logger.info("Trying to attaching volume " + volumeId + " to vm instance:" + vm.getId() + ", update async job-" + job.getId() + " progress status");
            }

            this._jobMgr.updateAsyncJobAttachment(job.getId(), "Volume", volumeId);
        }

        final AsyncJobExecutionContext jobContext = AsyncJobExecutionContext.getCurrentExecutionContext();
        if (jobContext.isJobDispatchedBy(VmWorkConstants.VM_WORK_JOB_DISPATCHER)) {
            // avoid re-entrance

            final VmWorkJobVO placeHolder;
            placeHolder = createPlaceHolderWork(vmId);
            try {
                return orchestrateAttachVolumeToVM(vmId, volumeId, deviceId, volumeToAttach.getDiskController());
            } finally {
                this._workJobDao.expunge(placeHolder.getId());
            }
        } else {
            final Outcome<Volume> outcome = attachVolumeToVmThroughJobQueue(vmId, volumeId, deviceId, volumeToAttach.getDiskController());

            Volume vol = null;
            try {
                outcome.get();
            } catch (final InterruptedException e) {
                throw new RuntimeException("Operation is interrupted", e);
            } catch (final java.util.concurrent.ExecutionException e) {
                throw new RuntimeException("Execution excetion", e);
            }

            final Object jobResult = this._jobMgr.unmarshallResultObject(outcome.getJob());
            if (jobResult != null) {
                if (jobResult instanceof ConcurrentOperationException) {
                    throw (ConcurrentOperationException) jobResult;
                } else if (jobResult instanceof InvalidParameterValueException) {
                    throw (InvalidParameterValueException) jobResult;
                } else if (jobResult instanceof RuntimeException) {
                    throw (RuntimeException) jobResult;
                } else if (jobResult instanceof Throwable) {
                    throw new RuntimeException("Unexpected exception", (Throwable) jobResult);
                } else if (jobResult instanceof Long) {
                    vol = this._volsDao.findById((Long) jobResult);
                }
            }
            return vol;
        }
    }
