@Override
  public ManageableSecurity[] extractSecurities() {
    FraTrade fraTrade = getTrade();
    
    validate(fraTrade);
    
    boolean payFixed = fraTrade.isPayFixed();
    
    double specifiedNotional = fraTrade.getNotional().doubleValue();
    
    //sign of notional determines the sides of the trade. 
    //pay fixed => positive; pay floating => negative
    double absoluteNotional = payFixed ? specifiedNotional : -specifiedNotional;
    
    ExternalId underlyingIdentifier = fraTrade.getFixingIndex().getIndex().toExternalId();
    
    
    FRASecurity fraSecurity = new FRASecurity(fraTrade.getCurrency(), 
                  fraTrade.getRegionId().toExternalId(), //region id not used.
                  convertLocalDate(fraTrade.getEffectiveDate()),
                  convertLocalDate(fraTrade.getTerminationDate()), 
                  fraTrade.getRate().doubleValue(), 
                  absoluteNotional, 
                  underlyingIdentifier, 
                  convertLocalDate(fraTrade.getFixingDate()));
    
    return securityArray(addIdentifier(fraSecurity));
  }
