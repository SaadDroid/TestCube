static OperationContext wrap(OperationContext context) {
    OpenShiftConfig config = OpenShiftConfig.wrap(context.getConfig());
    String oapiVersion = config.getOapiVersion();
    if (Utils.isNotNullOrEmpty(context.getApiGroupName())) {
      return getOperationContextWithApiGroupName(config, context, oapiVersion);
    } else {
      String apiGroupUrl = URLUtils.join(config.getMasterUrl(), "oapi", oapiVersion);
      return context.withConfig(new OpenShiftConfigBuilder(config).withOpenShiftUrl(apiGroupUrl).build()).withApiGroupVersion(oapiVersion);
    }
  }
