public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {

        if (!tpsLimiter.isAllowable(invoker.getUrl(), invocation)) {
            throw new RpcException(
                    new StringBuilder(64)
                            .append("Failed to invoke service ")
                            .append(invoker.getInterface().getName())
                            .append(".")
                            .append(invocation.getMethodName())
                            .append(" because exceed max service tps.")
                            .toString());
        }

        return invoker.invoke(invocation);
    }
