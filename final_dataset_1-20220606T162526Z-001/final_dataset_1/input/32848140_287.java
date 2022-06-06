@Override
  public synchronized List<HeliumPackage> getAll() throws IOException {
    HttpClient client = HttpClientBuilder.create()
        .setUserAgent("ApacheZeppelin/" + Util.getVersion())
        .setProxy(getProxy(uri()))
        .build();
    HttpGet get = new HttpGet(uri());
    HttpResponse response;
    try {
      ZeppelinConfiguration cfg = ZeppelinConfiguration.create();
      if ((get.getURI().getHost().equals(cfg.getS3Endpoint()))) {
        if (cfg.getS3Timeout() != null) {
          int timeout = Integer.valueOf(cfg.getS3Timeout());
          RequestConfig requestCfg = RequestConfig.custom()
                  .setConnectTimeout(timeout)
                  .setSocketTimeout(timeout)
                  .build();
          get.setConfig(requestCfg);
        }
      }
      response = client.execute(get);
    } catch (Exception e) {
      logger.error(e.getMessage());
      return readFromCache();
    }

    if (response.getStatusLine().getStatusCode() != 200) {
      // try read from cache
      logger.error(uri() + " returned " + response.getStatusLine().toString());
      return readFromCache();
    } else {
      List<HeliumPackage> packageList = new LinkedList<>();

      BufferedReader reader;
      reader = new BufferedReader(
          new InputStreamReader(response.getEntity().getContent()));

      List<Map<String, Map<String, HeliumPackage>>> packages = gson.fromJson(
          reader,
          new TypeToken<List<Map<String, Map<String, HeliumPackage>>>>() {
          }.getType());
      reader.close();

      for (Map<String, Map<String, HeliumPackage>> pkg : packages) {
        for (Map<String, HeliumPackage> versions : pkg.values()) {
          packageList.addAll(versions.values());
        }
      }

      writeToCache(packageList);
      return packageList;
    }
  }
