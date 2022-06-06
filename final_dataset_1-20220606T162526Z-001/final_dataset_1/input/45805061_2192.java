public PolynomialsLeastSquaresFitterResult regressVerbose(final double[] xData, final double[] yData, final int degree, final boolean normalize) {

    final LeastSquaresRegressionResult result = regress(xData, yData, degree, normalize);

    final int nData = xData.length;
    final DoubleMatrix2D rMatriX = _qrResult.getR();

    final DoubleMatrix1D resResult = new DoubleMatrix1D(result.getResiduals());
    final double resNorm = OG_ALGEBRA.getNorm2(resResult);

    if (normalize == true) {
      return new PolynomialsLeastSquaresFitterResult(result.getBetas(), rMatriX, nData - degree - 1, resNorm, _renorm);
    }
    return new PolynomialsLeastSquaresFitterResult(result.getBetas(), rMatriX, nData - degree - 1, resNorm);
  }
