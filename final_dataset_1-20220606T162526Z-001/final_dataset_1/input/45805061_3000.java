@Override
  public Function1D<T, RecombiningBinomialTree<DoublesPair>> getTreeGeneratingFunction(final OptionDefinition definition) {
    return new Function1D<T, RecombiningBinomialTree<DoublesPair>>() {

      @SuppressWarnings({"synthetic-access" })
      @Override
      public RecombiningBinomialTree<DoublesPair> evaluate(final T data) {
        final DoublesPair[] tempResults = new DoublesPair[_j];
        final DoublesPair[][] spotAndOptionPrices = new DoublesPair[_maxDepthToSave + 1][_maxWidthToSave];
        final OptionPayoffFunction<T> payoffFunction = definition.getPayoffFunction();
        final OptionExerciseFunction<T> exerciseFunction = definition.getExerciseFunction();
        final double u = _model.getUpFactor(definition, data, _n, _j);
        final double d = _model.getDownFactor(definition, data, _n, _j);
        final RecombiningBinomialTree<Double> pTree = _model.getUpProbabilityTree(definition, data, _n, _j);
        final double spot = data.getSpot();
        final double t = definition.getTimeToExpiry(data.getDate());
        final double r = data.getInterestRate(t);
        double newSpot = spot * Math.pow(d, _n);
        for (int i = 0; i < _j; i++) {
          tempResults[i] = DoublesPair.of(newSpot, payoffFunction.getPayoff((T) data.withSpot(newSpot), 0.));
          if (_n == _maxDepthToSave) {
            spotAndOptionPrices[_n][i] = tempResults[i];
          }
          newSpot *= u / d;
        }
        final double df = Math.exp(-r * t / _n);
        double optionValue, spotValue;
        T newData;
        double p;
        for (int i = _n - 1; i >= 0; i--) {
          for (int j = 0; j < RecombiningBinomialTree.NODES.evaluate(i); j++) {
            p = pTree.getNode(i, j);
            optionValue = df * ((1 - p) * tempResults[j].second + p * tempResults[j + 1].second);
            spotValue = tempResults[j].first / d;
            newData = (T) data.withSpot(spotValue);
            tempResults[j] = DoublesPair.of(spotValue, exerciseFunction.shouldExercise(newData, optionValue) ? payoffFunction.getPayoff(newData, optionValue) : optionValue);
            if (i <= _maxDepthToSave) {
              spotAndOptionPrices[i][j] = tempResults[j];
            }
          }
        }
        return new RecombiningBinomialTree<>(spotAndOptionPrices);
      }
    };
  }
