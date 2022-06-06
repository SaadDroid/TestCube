static ValidatorStatus getValidatorStatus(
      final UInt64 epoch, final tech.pegasys.teku.datastructures.state.Validator validator) {
    // pending
    if (validator.getActivation_epoch().isGreaterThan(epoch)) {
      return validator.getActivation_eligibility_epoch().equals(FAR_FUTURE_EPOCH)
          ? ValidatorStatus.pending_initialized
          : ValidatorStatus.pending_queued;
    }
    // active
    if (validator.getActivation_epoch().isLessThanOrEqualTo(epoch)
        && epoch.isLessThan(validator.getExit_epoch())) {
      if (validator.getExit_epoch().equals(FAR_FUTURE_EPOCH)) {
        return ValidatorStatus.active_ongoing;
      }
      return validator.isSlashed()
          ? ValidatorStatus.active_slashed
          : ValidatorStatus.active_exiting;
    }

    // exited
    if (validator.getExit_epoch().isLessThanOrEqualTo(epoch)
        && epoch.isLessThan(validator.getWithdrawable_epoch())) {
      return validator.isSlashed()
          ? ValidatorStatus.exited_slashed
          : ValidatorStatus.exited_unslashed;
    }

    // withdrawal
    if (validator.getWithdrawable_epoch().isLessThanOrEqualTo(epoch)) {
      return validator.getEffective_balance().isGreaterThan(UInt64.ZERO)
          ? ValidatorStatus.withdrawal_possible
          : ValidatorStatus.withdrawal_done;
    }
    throw new IllegalStateException("Unable to determine validator status");
  }
