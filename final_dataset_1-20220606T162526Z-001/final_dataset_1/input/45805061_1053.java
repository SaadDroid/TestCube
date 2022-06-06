@VisibleForTesting
  URI buildUri(DependencyGraphTraceBuilderProperties properties) {
    URI uri = getBaseUri();

    //process single value properties:
    String calcConfigName = properties.getCalculationConfigurationName();
    uri = DependencyGraphTraceProviderResource.uriCalculationConfigurationName(uri, calcConfigName);

    ValueProperties defaultProperties = properties.getDefaultProperties();
    uri = DependencyGraphTraceProviderResource.uriDefaultProperties(uri, defaultProperties);

    List<MarketDataSpecification> marketData = properties.getMarketData();
    if (marketData != null) {
      uri = DependencyGraphTraceProviderResource.uriMarketData(uri, marketData);
    }

    VersionCorrection resolutionTime = properties.getResolutionTime();
    uri = DependencyGraphTraceProviderResource.uriResolutionTime(uri, resolutionTime);

    Instant valuationTime = properties.getValuationTime();
    if (valuationTime != null) {
      uri = DependencyGraphTraceProviderResource.uriValuationTime(uri, valuationTime);
    }

    //process requirements:
    uri = processRequirements(uri, properties.getRequirements());

    return DependencyGraphTraceProviderResource.uriBuild(uri);
  }
