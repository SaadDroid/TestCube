public static String getMaxAgeForSlot(ChainDataProvider provider, UInt64 slot) {
    return provider.isFinalized(slot) ? CACHE_FINALIZED : CACHE_NONE;
  }
