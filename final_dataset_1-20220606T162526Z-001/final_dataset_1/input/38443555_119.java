@Override
  public Notification get(DataFetchingEnvironment environment) {
    final String username = environment.getArgument("username");
    if (Strings.isNullOrEmpty(username)) {
      throw new GraphQLValidationError("username cannot be empty");
    }

    final Map<String, Object> input = environment.getArgument("notification");
    if (input == null || input.isEmpty()) {
      throw new GraphQLValidationError("notification cannot be empty");
    }

    final String category = String.valueOf(input.get("category")).trim();
    if (Strings.isNullOrEmpty(category) || "null".equals(category)) {
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

    final String message = String.valueOf(input.get("message")).trim();
    if (Strings.isNullOrEmpty(message) || "null".equals(message)) {
      throw new GraphQLValidationError("message cannot be empty");
    }

    final int messageLength = message.codePointCount(0, message.length());

    if (messageLength < Notification.MESSAGE_MIN_LENGTH
        || messageLength > Notification.MESSAGE_MAX_LENGTH) {
      throw new GraphQLValidationError(
          String.format(
              "message must be between %d and %d characters",
              Notification.MESSAGE_MIN_LENGTH, Notification.MESSAGE_MAX_LENGTH));
    }

    final Notification.Builder builder = Notification.builder(category, message);

    final Object properties = input.get("properties");
    if (properties != null && properties instanceof Map) {
      builder.withProperties(convertToMap(properties));
    }

    final Notification notification = builder.build();

    try {
      return store.store(username, notification);
    } catch (NotificationStoreException e) {
      LOGGER.error(String.format("Unable to create notification for %s", username), e);
      throw new GraphQLValidationError("Unable to create notification");
    }
  }
