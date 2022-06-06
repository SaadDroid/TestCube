public static Map<Tenor, CurveInstrumentProvider> buildStandardBloomberg6MSwapInstrumentProvider(final String prefix) {
    final Map<Tenor, CurveInstrumentProvider> provider = new LinkedHashMap<>();
    for (int i = 1; i < 12; i++) {
      provider.put(Tenor.ofMonths(i), new StaticCurveInstrumentProvider(ExternalSchemes.bloombergTickerSecurityId(prefix + BBG_MONTH_CODES[i - 1] + " Curncy")));
    }
    for (int i = 12; i < 60; i += 3) {
      final int year = i / 12;
      final int month = i % 12;
      if (month == 0) {
        provider.put(Tenor.ofYears(year), new StaticCurveInstrumentProvider(ExternalSchemes.bloombergTickerSecurityId(prefix + year + " Curncy")));
      } else {
        final String code = year + BBG_MONTH_CODES[month - 1];
        provider.put(Tenor.ofMonths(i), new StaticCurveInstrumentProvider(ExternalSchemes.bloombergTickerSecurityId(prefix + code + " Curncy")));
      }
    }
    for (int i = 5; i < 61; i++) {
      provider.put(Tenor.ofYears(i), new StaticCurveInstrumentProvider(ExternalSchemes.bloombergTickerSecurityId(prefix + i + " Curncy")));
    }
    return provider;
  }
