public static BLSSignature aggregate(List<BLSSignature> signatures)
      throws IllegalArgumentException {
    checkArgument(signatures.size() > 0, "Aggregating zero signatures is invalid.");
    return new BLSSignature(
        getBlsImpl()
            .aggregateSignatures(
                signatures.stream().map(BLSSignature::getSignature).collect(Collectors.toList())));
  }
