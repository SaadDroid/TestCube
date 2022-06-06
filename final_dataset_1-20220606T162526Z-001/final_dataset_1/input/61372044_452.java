@Override
    @ActionEvent(eventType = EventTypes.EVENT_TEMPLATE_CREATE, eventDescription = "creating template", create = true)
    public VMTemplateVO createPrivateTemplateRecord(final CreateTemplateCmd cmd, final Account templateOwner) throws ResourceAllocationException {
        final Account caller = CallContext.current().getCallingAccount();
        final boolean isAdmin = this._accountMgr.isAdmin(caller.getId());

        this._accountMgr.checkAccess(caller, null, true, templateOwner);

        final String name = cmd.getTemplateName();
        if (name == null || name.length() > 32) {
            throw new InvalidParameterValueException("Template name cannot be null and should be less than 32 characters");
        }

        if (cmd.getTemplateTag() != null) {
            if (!this._accountService.isRootAdmin(caller.getId())) {
                throw new PermissionDeniedException("Parameter templatetag can only be specified by a Root Admin, permission denied");
            }
        }

        // do some parameter defaulting
        final Integer bits = cmd.getBits();
        final Boolean passwordEnabled = cmd.isPasswordEnabled();
        Boolean isPublic = cmd.isPublic();
        Boolean featured = cmd.isFeatured();
        final int bitsValue = bits == null ? 64 : bits;
        final boolean passwordEnabledValue = passwordEnabled != null && passwordEnabled;
        if (isPublic == null) {
            isPublic = Boolean.FALSE;
        }
        final boolean isDynamicScalingEnabled = cmd.isDynamicallyScalable();
        // check whether template owner can create public templates
        final boolean allowPublicUserTemplates = AllowPublicUserTemplates.valueIn(templateOwner.getId());
        if (!isAdmin && !allowPublicUserTemplates && isPublic) {
            throw new PermissionDeniedException("Failed to create template " + name + ", only private templates can be created.");
        }

        final Long volumeId = cmd.getVolumeId();
        final Long snapshotId = cmd.getSnapshotId();
        if (volumeId == null && snapshotId == null) {
            throw new InvalidParameterValueException("Failed to create private template record, neither volume ID nor snapshot ID were specified.");
        }
        if (volumeId != null && snapshotId != null) {
            throw new InvalidParameterValueException("Failed to create private template record, please specify only one of volume ID (" + volumeId +
                    ") and snapshot ID (" + snapshotId + ")");
        }

        HypervisorType hyperType;
        final VolumeVO volume;
        SnapshotVO snapshot = null;
        final VMTemplateVO privateTemplate;
        if (volumeId != null) { // create template from volume
            volume = this._volumeDao.findById(volumeId);
            if (volume == null) {
                throw new InvalidParameterValueException("Failed to create private template record, unable to find volume " + volumeId);
            }
            // check permissions
            this._accountMgr.checkAccess(caller, null, true, volume);

            // If private template is created from Volume, check that the volume
            // will not be active when the private template is
            // created
            if (!this._volumeMgr.volumeInactive(volume)) {
                final String msg = "Unable to create private template for volume: " + volume.getName() + "; volume is detached or attached to a Running VM";
                if (s_logger.isInfoEnabled()) {
                    s_logger.info(msg);
                }
                throw new CloudRuntimeException(msg);
            }

            hyperType = this._volumeDao.getHypervisorType(volumeId);

            // Try to find a better one than None
            if (hyperType == HypervisorType.None) {
                try {
                    final String hypers = _configDao.getValue(Config.HypervisorList.key());
                    final String[] hypervisors = hypers.split(",");
                    final String defaultHyper = hypervisors[0];
                    hyperType = HypervisorType.valueOf(defaultHyper);
                } catch (IllegalArgumentException e) {
                    s_logger.debug("Unable to get hypervisor from global settings");
                    hyperType = HypervisorType.None;
                }
            }

        } else { // create template from snapshot
            snapshot = this._snapshotDao.findById(snapshotId);
            if (snapshot == null) {
                throw new InvalidParameterValueException("Failed to create private template record, unable to find snapshot " + snapshotId);
            }
            // Volume could be removed so find including removed to record source template id.
            volume = this._volumeDao.findByIdIncludingRemoved(snapshot.getVolumeId());

            // check permissions
            this._accountMgr.checkAccess(caller, null, true, snapshot);

            if (snapshot.getState() != Snapshot.State.BackedUp) {
                throw new InvalidParameterValueException("Snapshot id=" + snapshotId + " is not in " + Snapshot.State.BackedUp +
                        " state yet and can't be used for template creation");
            }

            /*
             * // bug #11428. Operation not supported if vmware and snapshots
             * parent volume = ROOT if(snapshot.getHypervisorType() ==
             * HypervisorType.VMware && snapshotVolume.getVolumeType() ==
             * Type.DATADISK){ throw new UnsupportedServiceException(
             * "operation not supported, snapshot with id " + snapshotId +
             * " is created from Data Disk"); }
             */

            hyperType = snapshot.getHypervisorType();
        }

        this._resourceLimitMgr.checkResourceLimit(templateOwner, ResourceType.template);
        this._resourceLimitMgr.checkResourceLimit(templateOwner, ResourceType.secondary_storage, volume != null ? volume.getSize() : snapshot.getSize());

        if (!isAdmin || featured == null) {
            featured = Boolean.FALSE;
        }
        final Long guestOSId = cmd.getOsTypeId();
        final GuestOSVO guestOS = this._guestOSDao.findById(guestOSId);
        if (guestOS == null) {
            throw new InvalidParameterValueException("GuestOS with ID: " + guestOSId + " does not exist.");
        }

        final Long nextTemplateId = this._tmpltDao.getNextInSequence(Long.class, "id");
        final String description = cmd.getDisplayText();
        boolean isExtractable = false;
        Long sourceTemplateId = null;
        if (volume != null) {
            final VMTemplateVO template = ApiDBUtils.findTemplateById(volume.getTemplateId());
            isExtractable = template != null && template.isExtractable() && template.getTemplateType() != TemplateType.SYSTEM;
            if (volume.getIsoId() != null && volume.getIsoId() != 0) {
                sourceTemplateId = volume.getIsoId();
            } else if (volume.getTemplateId() != null) {
                sourceTemplateId = volume.getTemplateId();
            }
        }
        final String templateTag = cmd.getTemplateTag();
        if (templateTag != null) {
            if (s_logger.isDebugEnabled()) {
                s_logger.debug("Adding template tag: " + templateTag);
            }
        }

        // if specified from the API, use that one
        if (cmd.getHypervisor() != null) {
            hyperType = HypervisorType.getType(cmd.getHypervisor());
        }

        privateTemplate = new VMTemplateVO(nextTemplateId, name, ImageFormat.RAW, isPublic, featured, isExtractable, TemplateType.USER, null, bitsValue, templateOwner.getId(),
                null, description, passwordEnabledValue, guestOS.getId(), true, hyperType, templateTag, cmd.getDetails(), false,
                isDynamicScalingEnabled);

        if (sourceTemplateId != null) {
            if (s_logger.isDebugEnabled()) {
                s_logger.debug("This template is getting created from other template, setting source template Id to: " + sourceTemplateId);
            }
        }

        // for region wide storage, set cross zones flag
        final List<ImageStoreVO> stores = this._imgStoreDao.findRegionImageStores();
        if (stores.size() > 0) {
            privateTemplate.setCrossZones(true);
        }

        privateTemplate.setSourceTemplateId(sourceTemplateId);

        final VMTemplateVO template = this._tmpltDao.persist(privateTemplate);
        // Increment the number of templates
        if (template != null) {
            final Map<String, String> details = new HashMap<>();
            if (volume != null) {
                final Long vmId = volume.getInstanceId();
                if (vmId != null) {
                    final UserVmVO userVm = this._userVmDao.findById(vmId);
                    if (userVm != null) {
                        this._userVmDao.loadDetails(userVm);
                        details.putAll(userVm.getDetails());
                    }
                }
            }
            if (cmd.getDetails() != null) {
                details.remove("Encrypted.Password"); // new password will be generated during vm deployment from password enabled template
                details.putAll(cmd.getDetails());
            }
            if (!details.isEmpty()) {
                privateTemplate.setDetails(details);
                this._tmpltDao.saveDetails(privateTemplate);
            }

            this._resourceLimitMgr.incrementResourceCount(templateOwner.getId(), ResourceType.template);
            this._resourceLimitMgr.incrementResourceCount(templateOwner.getId(), ResourceType.secondary_storage,
                    new Long(volume != null ? volume.getSize() : snapshot.getSize()));
        }

        if (template != null) {
            return template;
        } else {
            throw new CloudRuntimeException("Failed to create a template");
        }
    }
