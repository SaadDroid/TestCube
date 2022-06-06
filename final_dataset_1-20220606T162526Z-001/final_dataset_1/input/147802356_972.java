static List<Long> computeDeltas(
      MutableStore store,
      Map<Bytes32, Integer> indices,
      List<UInt64> oldBalances,
      List<UInt64> newBalances) {
    List<Long> deltas = new ArrayList<>(Collections.nCopies(indices.size(), 0L));

    for (UInt64 validatorIndex : store.getVotedValidatorIndices()) {
      VoteTracker vote = store.getVote(validatorIndex);

      // There is no need to create a score change if the validator has never voted
      // or both their votes are for the zero hash (alias to the genesis block).
      if (vote.getCurrentRoot().equals(Bytes32.ZERO) && vote.getNextRoot().equals(Bytes32.ZERO)) {
        LOG.warn("ProtoArrayForkChoiceStrategy: Unexpected zero hashes in voted validator votes");
        continue;
      }

      int validatorIndexInt = toIntExact(validatorIndex.longValue());
      // If the validator was not included in the oldBalances (i.e. it did not exist yet)
      // then say its balance was zero.
      UInt64 oldBalance =
          oldBalances.size() > validatorIndexInt ? oldBalances.get(validatorIndexInt) : UInt64.ZERO;

      // If the validator vote is not known in the newBalances, then use a balance of zero.
      //
      // It is possible that there is a vote for an unknown validator if we change our
      // justified state to a new state with a higher epoch that is on a different fork
      // because that may have on-boarded less validators than the prior fork.
      UInt64 newBalance =
          newBalances.size() > validatorIndexInt ? newBalances.get(validatorIndexInt) : UInt64.ZERO;

      if (!vote.getCurrentRoot().equals(vote.getNextRoot()) || !oldBalance.equals(newBalance)) {
        // We ignore the vote if it is not known in `indices`. We assume that it is outside
        // of our tree (i.e. pre-finalization) and therefore not interesting.
        Integer currentDeltaIndex = indices.get(vote.getCurrentRoot());
        if (currentDeltaIndex != null) {
          checkState(
              currentDeltaIndex < deltas.size(), "ProtoArrayForkChoice: Invalid node delta index");
          long delta = subtractExact(deltas.get(currentDeltaIndex), oldBalance.longValue());
          deltas.set(currentDeltaIndex, delta);
        }

        // We ignore the vote if it is not known in `indices`. We assume that it is outside
        // of our tree (i.e. pre-finalization) and therefore not interesting.
        Integer nextDeltaIndex = indices.get(vote.getNextRoot());
        if (nextDeltaIndex != null) {
          checkState(
              nextDeltaIndex < deltas.size(), "ProtoArrayForkChoice: Invalid node delta index");
          long delta = addExact(deltas.get(nextDeltaIndex), newBalance.longValue());
          deltas.set(nextDeltaIndex, delta);
        }

        vote.setCurrentRoot(vote.getNextRoot());
      }
    }
    return deltas;
  }
