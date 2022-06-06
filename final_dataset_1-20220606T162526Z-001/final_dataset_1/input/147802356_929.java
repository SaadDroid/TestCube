@Override
  public Optional<Attestation> createUnsignedAttestation(
      final UInt64 slot, final int committeeIndex) {
    final Map<String, String> queryParams = new HashMap<>();
    queryParams.put("slot", encodeQueryParam(slot));
    queryParams.put("committee_index", String.valueOf(committeeIndex));

    return get(GET_UNSIGNED_ATTESTATION, queryParams, Attestation.class);
  }
