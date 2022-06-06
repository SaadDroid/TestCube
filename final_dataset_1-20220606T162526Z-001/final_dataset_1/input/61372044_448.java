@Override
    public VirtualMachineTemplate prepareTemplate(final long templateId, final long zoneId, final Long storageId) {

        final VMTemplateVO vmTemplate = this._tmpltDao.findById(templateId);
        if (vmTemplate == null) {
            throw new InvalidParameterValueException("Unable to find template id=" + templateId);
        }

        this._accountMgr.checkAccess(CallContext.current().getCallingAccount(), AccessType.OperateEntry, true, vmTemplate);

        if (storageId != null) {
            final StoragePoolVO pool = this._poolDao.findById(storageId);
            if (pool != null) {
                if (pool.getStatus() == StoragePoolStatus.Up && pool.getDataCenterId() == zoneId) {
                    prepareTemplateInOneStoragePool(vmTemplate, pool);
                } else {
                    s_logger.warn("Skip loading template " + vmTemplate.getId() + " into primary storage " + pool.getId() + " as either the pool zone "
                            + pool.getDataCenterId() + " is different from the requested zone " + zoneId + " or the pool is currently not available.");
                }
            }
        } else {
            prepareTemplateInAllStoragePools(vmTemplate, zoneId);
        }
        return vmTemplate;
    }
