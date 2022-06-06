public DoubleFunction1D add(final DoubleFunction1D f) {
    Validate.notNull(f, "f");
    return new DoubleFunction1D() {

      @Override
      public Double evaluate(final Double x) {
        return DoubleFunction1D.this.evaluate(x) + f.evaluate(x);
      }

    };
  }
