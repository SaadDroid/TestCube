@Override
  public Boolean get(DataFetchingEnvironment environment) {
    final String category = environment.getArgument("category");
    if (Strings.isNullOrEmpty(category)) {
      throw new GraphQLValidationError("category cannot be empty");
    }

    final int categoryLength = category.codePointCount(0, category.length());

    if (categoryLength < Notification.CATEGORY_MIN_LENGTH
        || categoryLength > Notification.CATEGORY_MAX_LENGTH) {
      throw new GraphQLValidationError(
          String.format(
              "category must be between %d and %d characters",
              Notification.CATEGORY_MIN_LENGTH, Notification.CATEGORY_MAX_LENGTH));
    }

    final Map<String, Object> input = environment.getArgument("rule");
    if (input == null || input.isEmpty()) {
      throw new GraphQLValidationError("rule cannot be empty");
    }

    final Rule.Builder builder = Rule.builder();
    if (input.containsKey("maxSize")) {
      try {
        builder.withMaxSize(Integer.parseInt(String.valueOf(input.get("maxSize"))));
      } catch (NumberFormatException e) {
        throw new GraphQLValidationError("maxSize is not an integer");
      }
    }
    if (input.containsKey("maxDuration")) {
      try {
        builder.withMaxDuration(Duration.parse(String.valueOf(input.get("maxDuration"))));
      } catch (IllegalArgumentException e) {
        throw new GraphQLValidationError("maxDuration is an invalid duration");
      }
    }
    if (input.containsKey("matchOn")) {
      builder.withMatchOn(String.valueOf(input.get("matchOn")));
    }

    final Rule rule = builder.build();

    if (!rule.isValid()) {
      throw new GraphQLValidationError("rule cannot be empty");
    }

    try {
      store.store(category, rule);
    } catch (NotificationStoreException e) {
      LOGGER.error(String.format("Unable to create rule for %s", category), e);
      throw new GraphQLValidationError("Unable to create rule");
    }

    return true;
  }
