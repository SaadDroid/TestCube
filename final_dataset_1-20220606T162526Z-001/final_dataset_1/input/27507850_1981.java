@Nonnull
  @VisibleForTesting
  static boolean validateHops(@Nonnull List<Hop> hops) {
    for (int i = 0; i < hops.size(); ++i) {
      Hop h = hops.get(i);
      List<Step<?>> steps = h.getSteps();
      if (i > 0) {
        Step<?> s = Iterables.getFirst(steps, null);
        checkArgument(
            s instanceof EnterInputIfaceStep,
            "Hop %s/%s of trace does not begin with an %s: %s",
            i + 1,
            hops.size(),
            "EnterInputIfaceStep",
            h);
      }
      if (i < hops.size() - 1) {
        Step<?> s = Iterables.getLast(steps, null);
        checkArgument(
            s instanceof ExitOutputIfaceStep,
            "Hop %s/%s of trace does not end with an %s: %s",
            i + 1,
            hops.size(),
            "ExitOutputIfaceStep",
            h);
      }
    }
    return true;
  }
