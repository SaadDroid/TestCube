public static Authenticator newInstance(Configuration config,
      String proxyCallbackUrl, ProxyCallbackHandler proxyCallbackHandler) {
    
    HttpsURLConnectionFactory connectionFactory = 
        new HttpsURLConnectionFactory(config.getSslContext(), 
            config.getHostnameVerifier());
    
    TicketValidator validator = createTicketValidator(config, 
        connectionFactory);

    if (validator instanceof Cas20ServiceTicketValidator) {
      configureServiceValidator(config, proxyCallbackUrl, proxyCallbackHandler,
          connectionFactory, (Cas20ServiceTicketValidator) validator);
    }
    if (validator instanceof Cas20ProxyTicketValidator) {
      configureProxyValidator(config, (Cas20ProxyTicketValidator)
          validator);
    }
    if (validator instanceof Saml11TicketValidator) {
      configureSamlValidator(config, (Saml11TicketValidator) validator);
    }
    return new JasigAuthenticator(config, validator);
  }
