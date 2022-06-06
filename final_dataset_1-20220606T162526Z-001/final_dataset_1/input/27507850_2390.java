static String getQuestionName(JSONObject question, String questionIdentifier) {
    if (!question.has(BfConsts.PROP_INSTANCE)) {
      throw new BatfishException(
          String.format("question %s does not have instance field", questionIdentifier));
    }
    try {
      if (!question.getJSONObject(BfConsts.PROP_INSTANCE).has(BfConsts.PROP_INSTANCE_NAME)) {
        throw new BatfishException(
            String.format(
                "question %s does not have instanceName field in instance", questionIdentifier));
      } else {
        return question
            .getJSONObject(BfConsts.PROP_INSTANCE)
            .getString(BfConsts.PROP_INSTANCE_NAME);
      }
    } catch (JSONException e) {
      throw new BatfishException(
          String.format("Failure in extracting instanceName from question %s", questionIdentifier));
    }
  }
