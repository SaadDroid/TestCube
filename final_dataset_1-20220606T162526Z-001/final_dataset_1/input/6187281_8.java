@Override
    public void afterPropertiesSet() {
        for (Class<?> type : workflowDelegateTypes()) {
            Map<String, ?> delegates = applicationContext.getBeansOfType(type);
            delegates.forEach((name, bean) -> {
                Object existing = activitiBeanRegistry.put(name, bean);
                if (existing != null) {
                    logger.warn("replaced existing {} with name {}", existing.getClass(), name);
                }
                logger.debug("registered Bundle component {} (type: {}) -> {}", name, type, bean);

                if (JavaDelegate.class.equals(type)) {
                    this.workflowTaskRegistry.registerDelegate(name, (JavaDelegate) bean);
                } else if (TaskListener.class.equals(type)) {
                    this.workflowTaskRegistry.registerTaskListener(name, (TaskListener) bean);
                } else if (ExecutionListener.class.equals(type)) {
                    this.workflowTaskRegistry.registerExecutionListener(name, (ExecutionListener) bean);
                }
            });
        }
    }
