@Override
    public Object call() {
        switch (currentTransaction) {
            case WRITE_FUNCTION: {
                try {
                    Preconditions.checkNotNull(data);
                    ServiceFunction serviceFunction = (ServiceFunction) data;
                    InstanceIdentifier<ServiceFunction> serviceFunctionIid = SfcIosXeUtils
                            .createSfIid(serviceFunction.getKey());
                    return writeMergeTransaction(serviceFunctionIid, serviceFunction);
                } catch (ClassCastException e) {
                    LOG.error("Argument data {} is not an instance of ServiceFunction", data);
                }
                break;
            }
            case READ_FUNCTION: {
                try {
                    Preconditions.checkNotNull(data);
                    SfName serviceFunction = (SfName) data;
                    InstanceIdentifier<ServiceFunction> serviceFunctionIid = SfcIosXeUtils
                            .createSfIid(new ServiceFunctionKey(serviceFunction.getValue()));
                    return readTransaction(serviceFunctionIid);
                } catch (ClassCastException e) {
                    LOG.error("Argument data {} is not an instance of ServiceFunction", data);
                }
                break;
            }
            case DELETE_FUNCTION: {
                try {
                    Preconditions.checkNotNull(data);
                    ServiceFunctionKey serviceFunctionKey = (ServiceFunctionKey) data;
                    InstanceIdentifier<ServiceFunction> serviceFunctionIid = SfcIosXeUtils
                            .createSfIid(serviceFunctionKey);
                    return deleteTransaction(serviceFunctionIid);
                } catch (ClassCastException e) {
                    LOG.error("Argument data {} is not an instance of ServiceFunction", data);
                }
                break;
            }
            case WRITE_LOCAL: {
                try {
                    Preconditions.checkNotNull(data);
                    Local localSff = (Local) data;
                    InstanceIdentifier<Local> localIid = SfcIosXeUtils.createLocalSffIid();
                    return writeMergeTransaction(localIid, localSff);
                } catch (ClassCastException e) {
                    LOG.error("Argument data {} is not an instance of Local", data);
                }
                break;
            }
            case READ_LOCAL: {
                InstanceIdentifier<Local> localIid = SfcIosXeUtils.createLocalSffIid();
                return readTransaction(localIid);
            }
            case DELETE_LOCAL: {
                InstanceIdentifier<Local> localIid = SfcIosXeUtils.createLocalSffIid();
                return deleteTransaction(localIid);
            }
            case WRITE_REMOTE: {
                try {
                    Preconditions.checkNotNull(data);
                    ServiceFfName remoteSff = (ServiceFfName) data;
                    InstanceIdentifier<ServiceFfName> remoteIid = SfcIosXeUtils.createRemoteSffIid(remoteSff);
                    return writeMergeTransaction(remoteIid, remoteSff);
                } catch (ClassCastException e) {
                    LOG.error("Argument data {} is not an instance of ServiceFfName", data);
                }
                break;
            }
            case DELETE_REMOTE: {
                try {
                    Preconditions.checkNotNull(data);
                    ServiceFfName remoteSff = (ServiceFfName) data;
                    InstanceIdentifier<ServiceFfName> remoteIid = SfcIosXeUtils.createRemoteSffIid(remoteSff);
                    return deleteTransaction(remoteIid);
                } catch (ClassCastException e) {
                    LOG.error("Argument data {} is not an instance of ServiceFfName", data);
                }
                break;
            }
            case READ_REMOTE: {
                try {
                    Preconditions.checkNotNull(data);
                    SffName remoteSffName = (SffName) data;
                    InstanceIdentifier<ServiceFfName> remoteIid = SfcIosXeUtils.createRemoteSffIid(remoteSffName);
                    return readTransaction(remoteIid);
                } catch (ClassCastException e) {
                    LOG.error("Argument data {} is not an instance of SffName", data);
                }
                break;
            }
            case WRITE_PATH: {
                try {
                    Preconditions.checkNotNull(data);
                    ServicePath path = (ServicePath) data;
                    InstanceIdentifier<ServicePath> pathIid = SfcIosXeUtils.createServicePathIid(path
                            .getKey());
                    return writeMergeTransaction(pathIid, path);
                } catch (ClassCastException e) {
                    LOG.error("Argument data {} is not an instance of ServicePath", data);
                }
                break;
            }
            case READ_PATH: {
                try {
                    Preconditions.checkNotNull(data);
                    ServicePathKey pathKey = (ServicePathKey) data;
                    InstanceIdentifier<ServicePath> pathIid = SfcIosXeUtils.createServicePathIid(pathKey);
                    return readTransaction(pathIid);
                } catch (ClassCastException e) {
                    LOG.error("Argument data {} is not an instance of ServicePath", data);
                }
                break;
            }
            case DELETE_PATH: {
                try {
                    Preconditions.checkNotNull(data);
                    ServicePathKey pathKey = (ServicePathKey) data;
                    InstanceIdentifier<ServicePath> pathIid = SfcIosXeUtils.createServicePathIid(pathKey);
                    return deleteTransaction(pathIid);
                } catch (ClassCastException e) {
                    LOG.error("Argument data {} is not an instance of ServicePathKey", data);
                }
                break;
            }
        }
        return null;
    }
