@Override
  public DoubleTimeSeries<?> evaluate(final SensitivityAndReturnDataBundle... data) {
    Validate.notNull(data, "data");
    DoubleTimeSeries<?> result = null;
    DoubleTimeSeries<?> pnl = null;
    for (final SensitivityAndReturnDataBundle bundle : data) {
      final Underlying underlying = bundle.getUnderlying();
      final Map<UnderlyingType, DoubleTimeSeries<?>> underlyingData = bundle.getUnderlyingReturnTS();
      if (result == null) {
        result = TaylorExpansionMultiplierCalculator.getTimeSeries(underlyingData, underlying);
        result = result.multiply(bundle.getValue());
      } else {
        pnl = TaylorExpansionMultiplierCalculator.getTimeSeries(underlyingData, underlying);
        result = result.add(pnl.multiply(bundle.getValue()));
      }
    }
    return result;
  }
