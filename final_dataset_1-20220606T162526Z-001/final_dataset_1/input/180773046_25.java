@NonNull
  public Optional<Stock> findById(@NonNull String symbol, @NonNull Instant date) {
    BoundStatement bound = findById.bind(symbol, date);
    ResultSet rs = session.execute(bound);
    return Optional.ofNullable(rs.one()).map(rowMapper);
  }
