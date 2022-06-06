public static ExternalId futureBundleToGenericFutureTicker(ExternalIdBundle bundle, ZonedDateTime now, OffsetTime futureExpiryTime, ZoneId futureExpiryTimeZone) {
    ZonedDateTime nextExpiry = now.toLocalDate().with(s_monthlyExpiryAdjuster).atTime(now.toLocalTime()).atZone(now.getZone());
    ExternalId bbgTicker = bundle.getExternalId(ExternalSchemes.BLOOMBERG_TICKER);
    if (bbgTicker == null) {
      throw new OpenGammaRuntimeException("Could not find a Bloomberg Ticker in the supplied bundle " + bundle.toString());
    }
    final String code = bbgTicker.getValue();
    final String marketSector = splitTickerAtMarketSector(code).getSecond();
    try {
      String typeCode;
      String monthCode;
      int year;
      if (code.length() > 4 && code.charAt(4) == ' ') {
        // four letter futures code
        typeCode = code.substring(0, 2);
        monthCode = code.substring(2, 3);
        year = Integer.parseInt(code.substring(3, 4));

        final int thisYear = now.getYear();
        if ((thisYear % 10) > year) {
          year = ((thisYear / 10) * 10) + 10 + year;
        } else if ((thisYear % 10) == year) {
          // This code assumes that the code is for this year, so constructs a trial date using the year and month and adjusts it forward to the expiry
          // note we're not taking into account exchange closing time here.
          final Month month = s_monthCode.inverse().get(monthCode);
          if (month == null) {
            throw new OpenGammaRuntimeException("Invalid month code " + monthCode);
          }
          LocalDate nextExpiryIfThisYear = LocalDate.of((((thisYear / 10) * 10) + year), month, 1).with(s_monthlyExpiryAdjuster);
          ZonedDateTime nextExpiryDateTimeIfThisYear = nextExpiryIfThisYear.atTime(futureExpiryTime).atZoneSimilarLocal(futureExpiryTimeZone);
          if (now.isAfter(nextExpiryDateTimeIfThisYear)) {
            year = ((thisYear / 10) * 10) + 10 + year;
          } else {
            year = ((thisYear / 10) * 10) + year;
          }
        } else {
          year = ((thisYear / 10) * 10) + year;
        }
      } else if (code.length() > 5 && code.charAt(5) == ' ') {
        // five letter futures code
        typeCode = code.substring(0, 2);
        monthCode = code.substring(2, 3);
        s_logger.warn("Parsing retired futures code format {}", code);
        year = Integer.parseInt(code.substring(3, 5));
        if (year > 70) { // 58 year time bomb and ticking...
          year += 1900;
        } else {
          year += 2000;
        }
      } else {
        s_logger.warn("Unknown futures code format {}", code);
        return null;
      }
      // phew.
      // now we generate the expiry of the future from the code:
      // Again, note that we're not taking into account exchange trading hours.
      LocalDate expiryDate = LocalDate.of(year, s_monthCode.inverse().get(monthCode), 1).with(s_monthlyExpiryAdjuster);
      ZonedDateTime expiry = expiryDate.atTime(futureExpiryTime).atZoneSimilarLocal(futureExpiryTimeZone);
      int quarters = (int) nextExpiry.periodUntil(expiry, MONTHS) / 3;
      int genericFutureNumber = quarters + 1;
      StringBuilder sb = new StringBuilder();
      sb.append(typeCode);
      sb.append(genericFutureNumber);
      sb.append(" ");
      sb.append(marketSector);
      return ExternalId.of(ExternalSchemes.BLOOMBERG_TICKER, sb.toString());
    } catch (final NumberFormatException nfe) {
      s_logger.error("Could not parse futures code {}", code);
    }
    return null;
  }
