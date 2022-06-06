@Override
  public Object postProcessAfterInitialization(Object bean, String beanName) {
    if (bean instanceof WebClient) {
      WebClient webClient = (WebClient) bean;
      return wrapBuilder(webClient.mutate()).build();
    } else if (bean instanceof WebClient.Builder) {
      WebClient.Builder webClientBuilder = (WebClient.Builder) bean;
      return wrapBuilder(webClientBuilder);
    }
    return bean;
  }
