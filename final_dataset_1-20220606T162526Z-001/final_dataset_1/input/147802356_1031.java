public static Validator create(
      BLSPublicKey pubkey,
      Bytes32 withdrawal_credentials,
      UInt64 effective_balance,
      boolean slashed,
      UInt64 activation_eligibility_epoch,
      UInt64 activation_epoch,
      UInt64 exit_epoch,
      UInt64 withdrawable_epoch) {
    return new Validator(
        pubkey,
        withdrawal_credentials,
        effective_balance,
        slashed,
        activation_eligibility_epoch,
        activation_epoch,
        exit_epoch,
        withdrawable_epoch);
  }
