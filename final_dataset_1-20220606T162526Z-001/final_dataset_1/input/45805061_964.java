public static ExposureFunction getExposureFunction(final SecuritySource securitySource, final String name) {
    ArgumentChecker.notNull(securitySource, "security source");
    ArgumentChecker.notNull(name, "name");
    if (name.startsWith(CombiningExposureFunction.NAME)) {
      String underlyingName = name.replace(CombiningExposureFunction.NAME, "");
      return new CombiningExposureFunction(getExposureFunction(securitySource, underlyingName));
    }
    switch (name) {
      case ContractCategoryExposureFunction.NAME:
        return new ContractCategoryExposureFunction(securitySource);
      case CounterpartyExposureFunction.NAME:
        return new CounterpartyExposureFunction();
      case CurrencyExposureFunction.NAME:
        return new CurrencyExposureFunction(securitySource);
      case RegionExposureFunction.NAME:
        return new RegionExposureFunction(securitySource);
      case SecurityAndCurrencyExposureFunction.NAME:
        return new SecurityAndCurrencyExposureFunction(securitySource);
      case SecurityAndRegionExposureFunction.NAME:
        return new SecurityAndRegionExposureFunction(securitySource);
      case SecurityAndSettlementExchangeExposureFunction.NAME:
        return new SecurityAndSettlementExchangeExposureFunction();
      case SecurityAndTradingExchangeExposureFunction.NAME:
        return new SecurityAndTradingExchangeExposureFunction();
      case SecurityExposureFunction.NAME:
        return new SecurityExposureFunction();
      case SecurityTypeExposureFunction.NAME:
        return new SecurityTypeExposureFunction();
      case TradeAttributeExposureFunction.NAME:
        return new TradeAttributeExposureFunction();
      case UnderlyingExposureFunction.NAME:
        return new UnderlyingExposureFunction(securitySource);
      default:
        throw new OpenGammaRuntimeException("Could not get exposure function called " + name);
    }
  }
