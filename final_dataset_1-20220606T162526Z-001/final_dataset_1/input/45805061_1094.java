public static Tenor plus(final Tenor tenor1, final Tenor tenor2) {
    if ((!tenor1.isBusinessDayTenor()) && (!tenor2.isBusinessDayTenor())) { // Standard periods
      return Tenor.of(tenor1.getPeriod().plus(tenor2.getPeriod()));
    }
    if (tenor1.equals(Tenor.of(Period.ZERO))) { // First tenor is ZERO
      return tenor2;
    }
    if (tenor2.equals(Tenor.of(Period.ZERO))) { // Second tenor is ZERO
      return tenor1;
    }
    if ((tenor1.equals(Tenor.ON)) && (tenor1.equals(Tenor.ON))) { // Both tenors are ON
      return Tenor.TN;
    }
    throw new IllegalArgumentException("Can not add " + tenor1 + " and " + tenor2);
  }
