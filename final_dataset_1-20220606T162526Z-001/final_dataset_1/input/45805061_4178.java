public static SwaptionBermudaFixedIborDefinition from(final SwapFixedIborDefinition underlyingTotalSwap, final boolean isLong, final ZonedDateTime[] expiryDate) {
    ArgumentChecker.notNull(expiryDate, "expiry date");
    ArgumentChecker.notNull(underlyingTotalSwap, "underlying swap");
    final int nbExpiry = underlyingTotalSwap.getFixedLeg().getNumberOfPayments();
    ArgumentChecker.isTrue(expiryDate.length == nbExpiry, "Number of expiries provided {} did not match the number of fixed payments of underlying swap {}", expiryDate.length, nbExpiry);
    final SwapFixedIborDefinition[] underlyingSwaps = new SwapFixedIborDefinition[nbExpiry];
    for (int loopexp = 0; loopexp < nbExpiry; loopexp++) {
      underlyingSwaps[loopexp] = underlyingTotalSwap.trimStart(expiryDate[loopexp]);
    }
    return new SwaptionBermudaFixedIborDefinition(underlyingSwaps, isLong, expiryDate);

  }
