@Override
  public Matrix backPropagate(final Matrix input, final Matrix activation, final Matrix nextError) {
    final Matrix error = matrixFactory.create(input.getRows(), input.getColumns());
    for (int n = 0; n < input.getColumns(); ++n) {
      final Matrix singleNextError = nextError.getColumn(n).reshape(outputShape[1] * outputShape[2], outputShape[0]);
      final Matrix row = singleNextError.mmul(getLayerParameter().getWeightParam().transpose());
      final Matrix im = row2im(row);
      error.putColumn(n, im);
    }
    return error;
  }
