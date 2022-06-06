public static DoubleTimeSeries<?> getTimeSeries(final Map<UnderlyingType, DoubleTimeSeries<?>> underlyingData, final Underlying underlying) {
    Validate.notNull(underlying, "underlying");
    Validate.notNull(underlyingData, "underlying data");
    Validate.notEmpty(underlyingData, "underlying data");
    Validate.noNullElements(underlyingData.keySet(), "underlying data keys");
    Validate.noNullElements(underlyingData.values(), "underlying data values");
    if (underlying instanceof NthOrderUnderlying) {
      final NthOrderUnderlying nthOrder = (NthOrderUnderlying) underlying;
      final int n = nthOrder.getOrder();
      if (n == 0) {
        throw new UnsupportedOperationException();
      }
      final UnderlyingType type = nthOrder.getUnderlying();
      Validate.isTrue(underlyingData.containsKey(type));
      DoubleTimeSeries<?> ts = underlyingData.get(type);
      ts = ts.power(n);
      return ts.multiply(getMultiplier(underlying));
    } else if (underlying instanceof MixedOrderUnderlying) {
      final MixedOrderUnderlying mixedOrder = (MixedOrderUnderlying) underlying;
      DoubleTimeSeries<?> result = null;
      DoubleTimeSeries<?> multiplier = null;
      int size = 0;
      for (final NthOrderUnderlying underlyingOrder : mixedOrder.getUnderlyingOrders()) {
        if (result == null) {
          result = getTimeSeries(underlyingData, underlyingOrder);
          size = result.size();
        } else {
          multiplier = getTimeSeries(underlyingData, underlyingOrder);
          if (multiplier.size() != size) {
            throw new IllegalArgumentException("Time series in map were not the same length");
          }
          result = result.multiply(multiplier);
          if (result.size() != size) {
            throw new IllegalArgumentException("Time series in map did not contain the same times");
          }
        }
      }
      return result;
    }
    throw new IllegalArgumentException("Order was neither NthOrderUnderlying nor MixedOrderUnderlying: have " + underlying.getClass());
  }
