public static BondFixedSecurityDefinition from(final Currency currency, final ZonedDateTime maturityDate, final ZonedDateTime firstAccrualDate,
      final Period paymentPeriod, final double rate, final int settlementDays, final Calendar calendar, final DayCount dayCount, final BusinessDayConvention businessDay,
      final YieldConvention yieldConvention, final boolean isEOM, final String issuer) {
    return from(currency, maturityDate, firstAccrualDate, paymentPeriod, rate, settlementDays, calendar, dayCount, businessDay, yieldConvention,
        isEOM, new LegalEntity(null, issuer, null, null, null));
  }
