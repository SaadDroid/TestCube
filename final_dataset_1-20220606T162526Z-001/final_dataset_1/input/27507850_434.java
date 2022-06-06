public static List<Statement> convert(FwTerm term, String vrfName) {
    TermFwThenToPacketPolicyStatement thenConverter =
        new TermFwThenToPacketPolicyStatement(vrfName);

    // Convert "then"s to action statements.
    return term.getThens().stream()
        .map(thenConverter::visit)
        .filter(Objects::nonNull)
        .collect(ImmutableList.toImmutableList());
  }
