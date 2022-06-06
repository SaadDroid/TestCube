public void asyncCall(String serviceName, Object message) {
    ServiceConfig serviceConfig =
        serviceFactory.getOrCreateServiceFlow(buildInFlowName).getOrCreateServiceConfig(serviceName);
    ServiceContext serviceContext = ServiceContextUtil.context(message);
    serviceContext.setCurrentServiceName(serviceName);
    buildServiceRouter(serviceConfig, 0).asyncCallService(serviceContext);
  }
