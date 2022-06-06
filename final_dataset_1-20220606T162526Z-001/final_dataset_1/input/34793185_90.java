public void addPluginToActionList(final RuleModeller ruleModeller,
                                      final Command addCommand,
                                      final Collection supportedScoreHolderTypes) {
        invokeScoreInformationCachedOperation(ruleModeller,
                                              scoreInformation -> {
                                                  Collection<String> scoreHolderFqns = scoreInformation.getScoreHolderFqnTypeFqns();
                                                  if (scoreHolderFqns.size() == 1 && supportedScoreHolderTypes.containsAll(scoreHolderFqns)) {
                                                      addCommand.execute();
                                                  }
                                              });
    }
