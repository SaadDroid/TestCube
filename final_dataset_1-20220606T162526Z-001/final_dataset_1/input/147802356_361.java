public Optional<byte[]> fuzzVoluntaryExit(final byte[] input) {
    VoluntaryExitFuzzInput structuredInput = deserialize(input, VoluntaryExitFuzzInput.class);

    try {
      BeaconState postState =
          structuredInput
              .getState()
              .updated(
                  state -> {
                    BlockProcessorUtil.process_voluntary_exits(
                        state, SSZList.singleton(structuredInput.getExit()));
                  });
      Bytes output = SimpleOffsetSerializer.serialize(postState);
      return Optional.of(output.toArrayUnsafe());
    } catch (BlockProcessingException e) {
      // "expected error"
      return Optional.empty();
    }
  }
