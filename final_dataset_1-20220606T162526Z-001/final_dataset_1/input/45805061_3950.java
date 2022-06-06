public static BondIborSecurityDefinition from(final ZonedDateTime maturityDate, final ZonedDateTime firstAccrualDate, final IborIndex index, final int settlementDays, final DayCount dayCount,
      final BusinessDayConvention businessDay, final boolean isEOM, final String issuer, final Calendar calendar) {
    return from(maturityDate, firstAccrualDate, index, settlementDays, dayCount, businessDay, isEOM, new LegalEntity(null, issuer, null, null, null), calendar);
  }
