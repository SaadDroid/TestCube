public InternalValidationResult validate(SignedVoluntaryExit exit) {
    if (!isFirstValidExitForValidator(exit)) {
      LOG.trace("VoluntaryExitValidator: Exit is not the first one for the given validator.");
      return IGNORE;
    }

    if (!passesProcessVoluntaryExitConditions(exit)) {
      return REJECT;
    }

    if (receivedValidExitSet.add(exit.getMessage().getValidator_index())) {
      return ACCEPT;
    } else {
      LOG.trace("VoluntaryExitValidator: Exit is not the first one for the given validator.");
      return IGNORE;
    }
  }
