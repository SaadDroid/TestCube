public Boolean dispatch(final ExecutionContext context) throws ExecuteException {
        /**
         * get executor manager
         */
        ExecutorManager<Boolean> executorManager = this.executorManagers.get(context.getExecutorType());
        if(executorManager == null){
            throw new ExecuteException("no ExecutorManager for type : " + context.getExecutorType());
        }

        /**
         * host select
         */

        Host host = hostManager.select(context);
        if (StringUtils.isEmpty(host.getAddress())) {
            throw new ExecuteException(String.format("fail to execute : %s due to no suitable worker , " +
                            "current task need to %s worker group execute",
                    context.getCommand(),context.getWorkerGroup()));
        }
        context.setHost(host);
        executorManager.beforeExecute(context);
        try {
            /**
             * task execute
             */
            return executorManager.execute(context);
        } finally {
            executorManager.afterExecute(context);
        }
    }
