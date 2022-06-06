@Override
    public void scheduleRestartForVmsOnHost(final HostVO host, final boolean investigate) {

        if (host.getType() != HostType.Routing) {
            return;
        }

        s_logger.warn("Scheduling restart for VMs on host " + host.getId() + "-" + host.getName());

        final List<VMInstanceVO> vms = _instanceDao.listByHostId(host.getId());
        final Zone zone = zoneRepository.findById(host.getDataCenterId()).orElse(null);

        // send an email alert that the host is down
        StringBuilder sb = null;
        final List<VMInstanceVO> reorderedVMList = new ArrayList<>();
        if (vms != null && !vms.isEmpty()) {
            sb = new StringBuilder();
            sb.append("  Starting HA on the following VMs:");
            // collect list of vm names for the alert email
            for (int i = 0; i < vms.size(); i++) {
                final VMInstanceVO vm = vms.get(i);
                if (vm.getType() == VirtualMachineType.User) {
                    reorderedVMList.add(vm);
                } else {
                    reorderedVMList.add(0, vm);
                }
                if (vm.isHaEnabled()) {
                    sb.append(" " + vm.getHostName());
                }
            }
        }

        // send an email alert that the host is down, include VMs
        final HostPodVO podVO = _podDao.findById(host.getPodId());
        final String hostDesc = "name: " + host.getName() + " (id:" + host.getId() + "), availability zone: " + zone.getName() + ", pod: " + podVO.getName();
        _alertMgr.sendAlert(AlertManager.AlertType.ALERT_TYPE_HOST, host.getDataCenterId(), host.getPodId(), "Host is down, " + hostDesc,
                "Host [" + hostDesc + "] is down." + (sb != null ? sb.toString() : ""));

        for (VMInstanceVO vm : reorderedVMList) {
            if (s_logger.isDebugEnabled()) {
                s_logger.debug("Notifying HA Mgr of to restart vm " + vm.getId() + "-" + vm.getInstanceName());
            }
            vm = _instanceDao.findByUuid(vm.getUuid());
            final Long hostId = vm.getHostId();
            if (hostId != null && !hostId.equals(host.getId())) {
                s_logger.debug("VM " + vm.getInstanceName() + " is not on down host " + host.getId() + " it is on other host "
                        + hostId + " VM HA is done");
                continue;
            }
            scheduleRestart(vm, investigate);
        }
    }
