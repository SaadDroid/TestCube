public void setFlowerFactory(FlowerFactory flowerFactory) {
    this.flowerFactory = flowerFactory;
    this.serviceInfoRegisterRouter =
        getServiceRouter("ServiceInfoRegisterService", ServiceInfo.class.getName(), Boolean.class.getName());
    this.serviceInfoListRouter =
        getServiceRouter("ServiceInfoListService", ServiceInfo.class.getName(), HashSet.class.getName());
    this.flowConfigRegisterRouter =
        getServiceRouter("FlowConfigRegisterService", FlowConfig.class.getName(), Boolean.class.getName());
    this.flowConfigListRouter =
        getServiceRouter("FlowConfigListService", FlowConfig.class.getName(), HashSet.class.getName());
  }
