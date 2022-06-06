protected boolean sendStop(final VirtualMachineGuru guru, final VirtualMachineProfile profile, final boolean force, final boolean checkBeforeCleanup) {
        final VirtualMachine vm = profile.getVirtualMachine();
        final StopCommand stop = new StopCommand(vm, getExecuteInSequence(vm.getHypervisorType()), checkBeforeCleanup);
        try {
            final Answer answer = _agentMgr.send(vm.getHostId(), stop);
            if (answer != null && answer instanceof StopAnswer) {
                final StopAnswer stopAns = (StopAnswer) answer;
                if (vm.getType() == VirtualMachineType.User) {
                    final String platform = stopAns.getPlatform();
                    if (platform != null) {
                        final UserVmVO userVm = _userVmDao.findById(vm.getId());
                        _userVmDao.loadDetails(userVm);
                        userVm.setDetail("platform", platform);
                        _userVmDao.saveDetails(userVm);
                    }
                }

                final GPUDeviceTO gpuDevice = stop.getGpuDevice();
                if (gpuDevice != null) {
                    _resourceMgr.updateGPUDetails(vm.getHostId(), gpuDevice.getGroupDetails());
                }
                if (!answer.getResult()) {
                    final String details = answer.getDetails();
                    s_logger.debug("Unable to stop VM due to " + details);
                    return false;
                }

                guru.finalizeStop(profile, answer);
            } else {
                s_logger.error("Invalid answer received in response to a StopCommand for " + vm.getInstanceName());
                return false;
            }
        } catch (final AgentUnavailableException e) {
            if (!force) {
                return false;
            }
        } catch (final OperationTimedoutException e) {
            if (!force) {
                return false;
            }
        }

        return true;
    }
