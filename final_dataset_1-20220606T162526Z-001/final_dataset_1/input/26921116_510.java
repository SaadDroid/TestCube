public double[] shap(DataFrame data) {
        // Binds the formula to the data frame's schema in case that
        // it is different from that of training data.
        formula.bind(data.schema());
        return shap(data.stream().parallel());
    }
