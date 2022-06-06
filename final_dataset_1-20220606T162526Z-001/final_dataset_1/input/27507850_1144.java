private FlowResult evaluate(PacketPolicy policy) {
    Action action =
        policy.getStatements().stream()
            .map(_stmtEvaluator::visit)
            .filter(Objects::nonNull)
            .findFirst()
            .orElse(policy.getDefaultAction().getAction());
    return new FlowResult(getTransformedFlow(), action);
  }
