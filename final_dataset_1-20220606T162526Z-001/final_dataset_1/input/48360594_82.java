public String replaceName(String inputName, boolean fuzzyQuery) throws IOException {
        ScoreDoc[] results = standardize(inputName, null, fuzzyQuery);
        return getFinalAccurateResult(inputName, results);
    }
