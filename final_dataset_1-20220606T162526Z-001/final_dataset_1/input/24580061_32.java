@Override
  public Matrix feedForward(final Matrix input) {
    final Matrix output = matrixFactory.create(NeuralNetworkUtils.getShapeLength(outputShape), input.getColumns());
    for (int n = 0; n < input.getColumns(); ++n) {
      final Matrix newValue = im2row(n, input).mmul(getLayerParameter().getWeightParam());
      output.putColumn(n, newValue.reshape(NeuralNetworkUtils.getShapeLength(outputShape), 1));
    }
    output.addiColumnVector(getLayerParameter().getBiasParam());
    return output;
  }
