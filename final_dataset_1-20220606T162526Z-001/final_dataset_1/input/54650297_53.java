@Override
    public ImmutableList<Value> eval(final ParseState parseState, final Encoding encoding) {
        final ImmutableList<Value> baseList = bases.eval(parseState, encoding);
        if (baseList.isEmpty()) {
            return baseList;
        }
        return count.evalSingle(parseState, encoding)
            .filter(countValue -> !countValue.equals(NOT_A_VALUE))
            .map(countValue -> expand(baseList, countValue.asNumeric().intValueExact(), new ImmutableList<>()).computeResult())
            .orElseThrow(() -> new IllegalArgumentException("Count must evaluate to a non-empty countable value."));
    }
