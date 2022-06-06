static <R extends AbstractRoute, D extends R> void queueDelta(
      Queue<RouteAdvertisement<R>> queue, @Nonnull RibDelta<D> delta) {
    delta
        .getActions()
        .forEach(
            r -> {
              @SuppressWarnings("unchecked") // Ok to upcast to R since immutable.
              RouteAdvertisement<R> sanitized = (RouteAdvertisement<R>) r.sanitizeForExport();
              queue.add(sanitized);
            });
  }
