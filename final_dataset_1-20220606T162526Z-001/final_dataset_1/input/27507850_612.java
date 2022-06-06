public LongSpace toLongSpace() {
    // Special case no matching lines
    if (_lines.isEmpty()) {
      return BgpPeerConfig.ALL_AS_NUMBERS;
    }

    // Build the space in the reverse order of the lines, using union/difference operations.
    LongSpace currentSpace = LongSpace.EMPTY;
    for (AristaBgpPeerFilterLine l : ImmutableList.copyOf(_lines.values()).reverse()) {
      if (l.getAction() == Action.ACCEPT) {
        currentSpace = currentSpace.union(l.getRange());
      } else if (l.getAction() == Action.REJECT) {
        currentSpace = currentSpace.difference(l.getRange());
      } else {
        throw new IllegalStateException(
            String.format("Unsupported bgp peer-filter action: %s", l.getAction()));
      }
    }
    return currentSpace;
  }
