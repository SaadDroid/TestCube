@Override
    public void processConnect(final Host host, final StartupCommand[] startupCommands, final boolean forRebalance) throws ConnectionException {
        for (final StartupCommand startupCommand : startupCommands) {
            if (startupCommand instanceof StartupRoutingCommand) {
                final StartupRoutingCommand scCmd = (StartupRoutingCommand) startupCommand;
                if (scCmd.getHypervisorType() == HypervisorType.XenServer || scCmd.getHypervisorType() == HypervisorType.KVM) {
                    final List<StoragePoolVO> pools = _poolDao.listBy(host.getDataCenterId(), host.getPodId(), host.getClusterId(), ScopeType.CLUSTER);
                    final List<StoragePoolVO> zoneStoragePoolsByTags = _poolDao.findZoneWideStoragePoolsByTags(host.getDataCenterId(), null);
                    final List<StoragePoolVO> zoneStoragePoolsByHypervisor = _poolDao.findZoneWideStoragePoolsByHypervisor(host.getDataCenterId(), scCmd.getHypervisorType());
                    zoneStoragePoolsByTags.retainAll(zoneStoragePoolsByHypervisor);
                    pools.addAll(zoneStoragePoolsByTags);
                    final List<StoragePoolVO> zoneStoragePoolsByAnyHypervisor = _poolDao.findZoneWideStoragePoolsByHypervisor(host.getDataCenterId(), HypervisorType.Any);
                    pools.addAll(zoneStoragePoolsByAnyHypervisor);

                    for (final StoragePoolVO pool : pools) {
                        if (pool.getStatus() != StoragePoolStatus.Up) {
                            continue;
                        }
                        if (!pool.isShared()) {
                            continue;
                        }

                        if (pool.getPoolType() == StoragePoolType.OCFS2 && !_ocfs2Mgr.prepareNodes(pool.getClusterId())) {
                            throw new ConnectionException(true, "Unable to prepare OCFS2 nodes for pool " + pool.getId());
                        }

                        final Long hostId = host.getId();
                        s_logger.debug("Host " + hostId + " connected, connecting host to shared pool id " + pool.getId() + " and sending storage pool information ...");
                        try {
                            _storageManager.connectHostToSharedPool(hostId, pool.getId());
                            _storageManager.createCapacityEntry(pool.getId());
                        } catch (final Exception e) {
                            throw new ConnectionException(true, "Unable to connect host " + hostId + " to storage pool id " + pool.getId() + " due to " + e.toString(), e);
                        }
                    }
                }
            }
        }
    }
