@Override
  public void define(Context context) {
    if (externalIssuesSupported) {
      RULE_LOADER.createExternalRuleRepository(context);
    }
  }
