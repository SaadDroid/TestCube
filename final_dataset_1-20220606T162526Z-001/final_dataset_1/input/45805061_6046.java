public BloombergEQVanillaOptionChain narrowByExpiry(int monthsFromToday) {
    return narrowByExpiry(LocalDate.now(OpenGammaClock.getInstance()), monthsFromToday);
  }
