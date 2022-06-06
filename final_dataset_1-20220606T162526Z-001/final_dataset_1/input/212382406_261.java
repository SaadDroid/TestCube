@Override
  public Object getAttribute(String attribute)
      throws AttributeNotFoundException, MBeanException, ReflectionException {
    for (String histogramAttribute : histogramAttributes) {
      if (attribute.endsWith("_" + histogramAttribute.toUpperCase())) {
        String keyName = attribute
            .substring(0, attribute.length() - histogramAttribute.length() - 1);
        try {
          HistogramData histogram =
              statistics.getHistogramData(HistogramType.valueOf(keyName));
          try {
            Method method =
                HistogramData.class.getMethod("get" + histogramAttribute);
            return method.invoke(histogram);
          } catch (Exception e) {
            throw new ReflectionException(e,
                "Can't read attribute " + attribute);
          }
        } catch (IllegalArgumentException exception) {
          throw new AttributeNotFoundException(
              "No such attribute in RocksDB stats: " + attribute);
        }
      }
    }
    try {
      return statistics.getTickerCount(TickerType.valueOf(attribute));
    } catch (IllegalArgumentException ex) {
      throw new AttributeNotFoundException(
          "No such attribute in RocksDB stats: " + attribute);
    }
  }
