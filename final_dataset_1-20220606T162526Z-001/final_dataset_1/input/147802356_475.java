public SafeFuture<InternalValidationResult> validate(SignedBeaconBlock block) {

    if (!blockSlotIsGreaterThanLatestFinalizedSlot(block)
        || !blockIsFirstBlockWithValidSignatureForSlot(block)) {
      LOG.trace(
          "BlockValidator: Block is either too old or is not the first block with valid signature for "
              + "its slot. It will be dropped");
      return SafeFuture.completedFuture(InternalValidationResult.IGNORE);
    }

    return recentChainData
        .retrieveBlockState(block.getMessage().getParent_root())
        .thenApply(
            preState -> {
              if (preState.isEmpty() || blockIsFromFutureSlot(block)) {
                LOG.trace(
                    "BlockValidator: Either block pre state does not exist or block is from the future. "
                        + "It will be saved for future processing");
                return InternalValidationResult.SAVE_FOR_FUTURE;
              }

              try {
                BeaconState postState =
                    stateTransition.process_slots(preState.get(), block.getMessage().getSlot());
                if (blockIsProposedByTheExpectedProposer(block, postState)
                    && blockSignatureIsValidWithRespectToProposerIndex(
                        block, preState.get(), postState)
                    && currentFinalizedCheckpointIsAncestorOfBlock(block)) {
                  return InternalValidationResult.ACCEPT;
                }
              } catch (EpochProcessingException | SlotProcessingException e) {
                LOG.error("BlockValidator: Unable to process block state.", e);
                return InternalValidationResult.REJECT;
              }

              return InternalValidationResult.REJECT;
            });
  }
