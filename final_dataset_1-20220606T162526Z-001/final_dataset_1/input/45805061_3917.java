@Override
  public SwapFuturesPriceDeliverableTransaction toDerivative(final ZonedDateTime dateTime, final Double lastMarginPrice) {
    final double referencePrice = referencePrice(dateTime, lastMarginPrice);
    final SwapFuturesPriceDeliverableSecurity underlying = getUnderlyingSecurity().toDerivative(dateTime);
    final SwapFuturesPriceDeliverableTransaction future = new SwapFuturesPriceDeliverableTransaction(underlying, referencePrice, getQuantity());
    return future;
  }
