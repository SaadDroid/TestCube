public Optional<Ip> getRepresentative(IpSpace ipSpace) {
    return _ipSpaceToBDD
        .getBDDInteger()
        .getValueSatisfying(_ipSpaceToBDD.visit(ipSpace))
        .map(Ip::create);
  }
