public Optional<Flow.Builder> getRepresentativeFlow(HeaderSpace hs) {
    return BDD_PACKET.getFlow(_headerSpaceToBDD.toBDD(hs), _preference);
  }
