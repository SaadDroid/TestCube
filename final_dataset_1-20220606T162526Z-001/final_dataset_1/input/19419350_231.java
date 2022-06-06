@Override
    public Result analyze() {
        checkState(!analyzed);
        analyzed = true;

        Result result = analyzeIsFinal();
        if (result != null && result != Result.OK)
            return result;

        return analyzeIsStandard();
    }
