public double price(double s0, double k, double r, double b, double t, double sigma, boolean isCall) {

    double fwd = s0 * Math.exp(b * t);
    double df = Math.exp(-r * t);
    double bsPrice = df * BlackFormulaRepository.price(fwd, k, t, sigma, isCall);
    double immediateExPrice = isCall ? Math.max(s0 - k, 0.0) : Math.max(k - s0, 0.0);

    // An American option price must be at least the maximum of immediate exercise and Black-Scholes price
    double lowBoundPrice = Math.max(immediateExPrice, bsPrice);

    // if the volatility is zero it is either optimal to exercise immediatly or wait til expiry
    if (sigma * Math.sqrt(t) < SMALL) {
      return lowBoundPrice;
    }

    if (isCall) {
      return Math.max(lowBoundPrice, getCallPrice(s0, k, r, b, t, sigma, bsPrice));
    }

    double temp = (2 * b + sigma * sigma) / 2 / sigma;
    double minR = b - 0.5 * temp * temp;
    // this does not give the best possible lower bound. Bjerksund-Stensland will give an answer for r < 0, but will fail for r < minR (complex beta)
    // TODO review the Bjerksund-Stensland formalisation to see if a general r < 0 (for puts) solution is possible
    if (r < minR) {
      return lowBoundPrice;
    }
    // put using put-call transformation
    return Math.max(lowBoundPrice, getCallPrice(k, s0, r - b, -b, t, sigma, bsPrice));
  }
