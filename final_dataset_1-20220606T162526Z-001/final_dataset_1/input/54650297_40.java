@Override
    public ImmutableList<Value> eval(final ParseState parseState, final Encoding encoding) {
        return scopeSize.evalSingle(parseState, encoding)
            .filter(sizeValue -> !sizeValue.equals(NOT_A_VALUE) && sizeValue.asNumeric().compareTo(ZERO) >= 0)
            .map(sizeValue -> scopedValueExpression.eval(parseState.withOrder(calculateScope(parseState.order, sizeValue.asNumeric().intValueExact())), encoding))
            .orElseThrow(() -> new IllegalArgumentException("Argument scopeSize must evaluate to a positive, countable value."));

    }
