public HestonCharacteristicExponent withOmega(final double omega) {
    return new HestonCharacteristicExponent(_kappa, _theta, _vol0, omega, _rho);
  }
