@VisibleForTesting
  static @Nonnull AsPathAccessList toAsPathAccessList(IpAsPathAccessList asPathAccessList) {
    String name = asPathAccessList.getName();
    List<AsPathAccessListLine> lines =
        asPathAccessList.getLines().stream()
            // TODO Check FRR AS path match semantics.
            // This regex assumes we should match any path containing the specified ASN anywhere.
            .map(
                line ->
                    new AsPathAccessListLine(
                        line.getAction(), String.format("(^| )%s($| )", line.getAsNum())))
            .collect(ImmutableList.toImmutableList());
    return new AsPathAccessList(name, lines);
  }
