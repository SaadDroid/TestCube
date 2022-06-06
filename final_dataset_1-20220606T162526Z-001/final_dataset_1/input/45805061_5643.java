@PUT
  @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
  @Produces(MediaType.APPLICATION_JSON)
  public Response putJSON(@FormParam("quantity") String quantityStr, 
      @FormParam("tradesJson") String tradesJson, 
      @FormParam("type") String type, 
      @FormParam(POSITION_XML) String positionXml) {
    
    PositionDocument doc = data().getPosition();
    if (doc.isLatest() == false) {
      return Response.status(Status.FORBIDDEN).entity(getHTML()).build();
    }
    type = defaultString(trimToNull(type));
    switch (type) {
      case "xml":
        updatePosition(trimToEmpty(positionXml));
        break;
      default:
        quantityStr = replace(trimToNull(quantityStr), ",", "");
        tradesJson = trimToNull(tradesJson);
        Collection<ManageableTrade> trades = null;
        if (tradesJson != null) {
          trades = parseTrades(tradesJson);
        } else {
          trades = Collections.<ManageableTrade>emptyList();
        }
        BigDecimal quantity = quantityStr != null && NumberUtils.isNumber(quantityStr) ? new BigDecimal(quantityStr) : null;
        updatePosition(doc, quantity, trades);
    }
    return Response.ok().build();
  }
