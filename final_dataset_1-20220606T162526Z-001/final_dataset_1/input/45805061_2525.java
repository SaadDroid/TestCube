public static ComplexNumber[] transform1DComplex(final ComplexNumber[] z) {
    ArgumentChecker.notNull(z, "array of complex number");
    final int n = z.length;
    final double[] a = packFull(z);
    DoubleFFT_1D fft = CACHE_1D.get(n);
    if (fft == null) {
      fft = new DoubleFFT_1D(n);
      CACHE_1D.put(n, fft);
    }
    fft.complexForward(a);
    return unpackFull(a);
  }
