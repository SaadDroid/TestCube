@Override
    public double d(String x, String y) {
        if (weight != null)
            return weightedEdit(x, y);
        else if (FKP == null || x.length() == 1 || y.length() == 1)
            return damerau ? damerau(x, y) : levenshtein(x, y);
        else
            return br(x, y);
    }
