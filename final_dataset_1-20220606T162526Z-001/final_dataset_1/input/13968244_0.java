public static void setupProxy() {
        String proxyHost = Configuration.get(Parameter.PROXY_HOST);
        String proxyPort = Configuration.get(Parameter.PROXY_PORT);
        String noProxy = Configuration.get(Parameter.NO_PROXY);

        List<String> protocols = Arrays.asList(Configuration.get(Parameter.PROXY_PROTOCOLS).split("[\\s,]+"));

        //TODO: test removal comparing with null
        if (proxyHost != null && !proxyHost.isEmpty() && proxyPort != null && !proxyPort.isEmpty()
                && Configuration.getBoolean(Parameter.PROXY_SET_TO_SYSTEM)) {
            if (protocols.contains("http")) {
                LOGGER.info(String.format("HTTP client will use http: %s:%s", proxyHost, proxyPort));

                System.setProperty("http.proxyHost", proxyHost);
                System.setProperty("http.proxyPort", proxyPort);
                
                if (!noProxy.isEmpty()) {
                    System.setProperty("http.nonProxyHosts", proxyPort);
                }
            }

            if (protocols.contains("https")) {
                LOGGER.info(String.format("HTTP client will use https proxies: %s:%s", proxyHost, proxyPort));

                System.setProperty("https.proxyHost", proxyHost);
                System.setProperty("https.proxyPort", proxyPort);
                
                if (!noProxy.isEmpty()) {
                    System.setProperty("https.nonProxyHosts", proxyPort);
                }
            }

            if (protocols.contains("ftp")) {
                LOGGER.info(String.format("HTTP client will use ftp proxies: %s:%s", proxyHost, proxyPort));

                System.setProperty("ftp.proxyHost", proxyHost);
                System.setProperty("ftp.proxyPort", proxyPort);
                
                if (!noProxy.isEmpty()) {
                    System.setProperty("ftp.nonProxyHosts", proxyPort);
                }
            }

            if (protocols.contains("socks")) {
                LOGGER.info(String.format("HTTP client will use socks proxies: %s:%s", proxyHost, proxyPort));
                System.setProperty("socksProxyHost", proxyHost);
                System.setProperty("socksProxyPort", proxyPort);
                
                /*
                 * http://docs.oracle.com/javase/8/docs/technotes/guides/net/proxies.html
                 * Once a SOCKS proxy is specified in this manner, all TCP connections will be attempted through the proxy.
                 * i.e. There is no provision for setting non-proxy hosts via the socks properties.
                 */
            }
            
        }
    }
