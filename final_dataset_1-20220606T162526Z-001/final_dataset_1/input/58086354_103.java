public static Channel intercept(Channel channel, ClientInterceptor... interceptors) {
    return intercept(channel, Arrays.asList(interceptors));
  }
