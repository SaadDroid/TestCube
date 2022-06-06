@Override
  public Force join(LVertex first, LVertex second) {
    Vector force = calculateForce(first, second);
    firstForce.set(first.getId(), force);
    return firstForce;
  }
