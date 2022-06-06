@Override
    public T apply(final T state, final T input) {
        if (binaryOperator == null) {
            throw new IllegalArgumentException("BinaryOperator cannot be null");
        }
        return adaptOutput(binaryOperator.apply(adaptInput(state), adaptInput(input)), state);
    }
