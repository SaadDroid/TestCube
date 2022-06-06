@Override
    public double getLevel() {
        return new Median().evaluate(expressionValuesSorted());
    }
