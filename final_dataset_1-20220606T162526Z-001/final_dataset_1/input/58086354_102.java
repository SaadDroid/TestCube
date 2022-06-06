public static Channel interceptForward(Channel channel, ClientInterceptor... interceptors) {
    return interceptForward(channel, Arrays.asList(interceptors));
  }
