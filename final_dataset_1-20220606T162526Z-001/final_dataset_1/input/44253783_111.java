public static int getPort(String serviceName, String type) {

    int port = -1;

    try {
      if (service == null) {
        service = new GetServiceByName();
      }

      port = service.getPortByName(serviceName, type);
    }
    catch (Exception ignoredByDesign) {
      // Do Nothing
      ;
    }

    return port;
  }
