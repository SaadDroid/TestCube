public static Map<Tenor, CurveInstrumentProvider> buildStandardBloombergEuriborInstrumentProvider() {
    final Map<Tenor, CurveInstrumentProvider> provider = new LinkedHashMap<>();
    for (int i = 1; i < 4; i++) {
      provider.put(Tenor.ofDays(i * 7), new StaticCurveInstrumentProvider(ExternalSchemes.bloombergTickerSecurityId("EUR00" + i + "W Index")));
    }
    for (int i = 1; i < 10; i++) {
      provider.put(Tenor.ofMonths(i), new StaticCurveInstrumentProvider(ExternalSchemes.bloombergTickerSecurityId("EUR00" + i + "M Index")));
    }
    return provider;
  }
