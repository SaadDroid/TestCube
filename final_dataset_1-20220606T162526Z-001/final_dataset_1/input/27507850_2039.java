public boolean permits(Prefix prefix) {
    if (_deniedCache.get().contains(prefix)) {
      return false;
    } else if (_permittedCache.get().contains(prefix)) {
      return true;
    }
    return evaluatePrefix(prefix);
  }
