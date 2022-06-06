public Object syncCall(String serviceName, Object message) throws TimeoutException {
    ServiceConfig serviceConfig =
        serviceFactory.getOrCreateServiceFlow(buildInFlowName).getOrCreateServiceConfig(serviceName);
    ServiceContext serviceContext = ServiceContextUtil.context(message);
    serviceContext.setCurrentServiceName(serviceName);
    return buildServiceRouter(serviceConfig, 0).syncCallService(serviceContext);
  }
