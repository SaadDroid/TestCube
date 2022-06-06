@Override
    public MLFeatureModifier build() {
        return new VectorNGramFeatureModifier(gramLength, getGrams());
    }
