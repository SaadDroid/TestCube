@Override
    protected void abortOpResult(Throwable t,
                                 @Nullable OpResult opResult) {
        Throwable cause;
        if (null == opResult) {
            cause = t;
        } else {
            assert (opResult instanceof OpResult.ErrorResult);
            OpResult.ErrorResult errorResult = (OpResult.ErrorResult) opResult;
            if (KeeperException.Code.OK.intValue() == errorResult.getErr()) {
                cause = t;
            } else {
                cause = KeeperException.create(KeeperException.Code.get(errorResult.getErr()));
            }
        }
        if (null != listener) {
            listener.onAbort(cause);
        }
    }
