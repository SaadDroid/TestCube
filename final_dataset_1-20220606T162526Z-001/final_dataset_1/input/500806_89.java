@Override
    public void validate(String fieldName, String value, List<String> controlParameters, TestContext context) throws ValidationException {
        String matcherExpression;
        String matcherValue = value;

        if (controlParameters.size() > 1) {
            matcherValue = context.replaceDynamicContentInString(controlParameters.get(0));
            matcherExpression = controlParameters.get(1);
        } else {
            matcherExpression = controlParameters.get(0);
        }

        String matcherName = matcherExpression.trim().substring(0, matcherExpression.trim().indexOf("("));
        String[] matcherParameter = matcherExpression.trim().substring(matcherName.length() + 1, matcherExpression.trim().length() - 1).split(",");

        for (int i = 0; i < matcherParameter.length; i++) {
            matcherParameter[i] = VariableUtils.cutOffSingleQuotes(matcherParameter[i].trim());
        }

        try {
            Matcher matcher = getMatcher(matcherName, matcherParameter, context);
            if (noArgumentCollectionMatchers.contains(matcherName) ||
                    collectionMatchers.contains(matcherName) ||
                    matcherName.equals("everyItem")) {
                assertThat(getCollection(matcherValue), matcher);
            } else if (mapMatchers.contains(matcherName)) {
                assertThat(getMap(matcherValue), matcher);
            } else if (numericMatchers.contains(matcherName)) {
                if (matcherName.equals("closeTo")) {
                    assertThat(Double.valueOf(matcherValue), matcher);
                } else {
                    assertThat(new NumericComparable(matcherValue), matcher);
                }
            } else if (iterableMatchers.contains(matcherName) && containsNumericMatcher(matcherExpression)) {
                assertThat(new NumericComparable(matcherValue), matcher);
            } else {
                assertThat(matcherValue, matcher);
            }
        } catch (AssertionError e) {
            throw new ValidationException(this.getClass().getSimpleName()
                    + " failed for field '" + fieldName
                    + "'. Received value is '" + value
                    + "' and did not match '" + matcherExpression + "'.", e);
        }
    }
