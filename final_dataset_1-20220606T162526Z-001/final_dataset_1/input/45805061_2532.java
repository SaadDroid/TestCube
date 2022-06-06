public static ComplexNumber[] transform1DReal(final double[] h) {
    ArgumentChecker.notEmpty(h, "array of doubles");
    final int n = h.length;
    final double[] a = Arrays.copyOf(h, n);
    DoubleFFT_1D fft = CACHE_1D.get(n);
    if (fft == null) {
      fft = new DoubleFFT_1D(n);
      CACHE_1D.put(n, fft);
    }
    fft.realForward(a);
    return unpack(a);
  }
