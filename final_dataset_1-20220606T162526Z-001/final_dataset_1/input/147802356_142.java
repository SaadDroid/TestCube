public Optional<Integer> validatorParameterToIndex(final String validatorParameter) {
    if (!isStoreAvailable()) {
      throw new ChainDataUnavailableException();
    }
    final Optional<tech.pegasys.teku.datastructures.state.BeaconState> maybeState =
        recentChainData.getBestState();
    if (maybeState.isEmpty()) {
      return Optional.empty();
    }
    final tech.pegasys.teku.datastructures.state.BeaconState state = maybeState.get();

    if (validatorParameter.toLowerCase().startsWith("0x")) {
      try {
        BLSPubKey publicKey = BLSPubKey.fromHexString(validatorParameter);
        return ValidatorsUtil.getValidatorIndex(state, publicKey.asBLSPublicKey());
      } catch (PublicKeyException ex) {
        throw new IllegalArgumentException(
            String.format("Invalid public key: %s", validatorParameter));
      }
    } else {
      try {
        final UInt64 numericValidator = UInt64.valueOf(validatorParameter);
        if (numericValidator.isGreaterThan(UInt64.valueOf(Integer.MAX_VALUE))) {
          throw new IllegalArgumentException(
              String.format("Validator Index is too high to use: %s", validatorParameter));
        }
        final int validatorIndex = numericValidator.intValue();
        final int validatorCount = state.getValidators().size();
        if (validatorIndex > validatorCount) {
          throw new IllegalArgumentException(
              String.format(
                  "Invalid validator index: %d, exceeds validator count: %d",
                  validatorIndex, validatorCount));
        }
        return Optional.of(validatorIndex);
      } catch (NumberFormatException ex) {
        throw new IllegalArgumentException(
            String.format("Invalid validator: %s", validatorParameter));
      }
    }
  }
