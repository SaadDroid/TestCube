public Map<String, Answer> processAnalysisAnswers(
      Map<String, String> rawAnswers, Map<String, AnswerRowsOptions> answersRowsOptions) {
    return CollectionUtil.toImmutableMap(
        rawAnswers,
        Entry::getKey,
        rawAnswersEntry ->
            processAnswerRows(
                rawAnswersEntry.getValue(), answersRowsOptions.get(rawAnswersEntry.getKey())));
  }
