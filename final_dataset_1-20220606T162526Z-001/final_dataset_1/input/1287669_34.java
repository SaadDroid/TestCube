public WithJsonPath(JsonPath jsonPath, Matcher<T> resultMatcher) {
        this.jsonPath = jsonPath;
        this.resultMatcher = resultMatcher;
    }
