public static List<Integer> get_beacon_committee(BeaconState state, UInt64 slot, UInt64 index) {
    // Make sure state is within range of the slot being queried
    validateStateForCommitteeQuery(state, slot);

    return BeaconStateCache.getTransitionCaches(state)
        .getBeaconCommittee()
        .get(
            Pair.of(slot, index),
            p -> {
              UInt64 epoch = compute_epoch_at_slot(slot);
              UInt64 committees_per_slot = get_committee_count_per_slot(state, epoch);
              int committeeIndex =
                  slot.mod(SLOTS_PER_EPOCH).times(committees_per_slot).plus(index).intValue();
              int count = committees_per_slot.times(SLOTS_PER_EPOCH).intValue();
              return compute_committee(
                  state,
                  get_active_validator_indices(state, epoch),
                  get_seed(state, epoch, DOMAIN_BEACON_ATTESTER),
                  committeeIndex,
                  count);
            });
  }
