@Override
  public List<GraphQLError> validateFields(FieldValidationEnvironment environment) {
    final List<GraphQLError> errors = new ArrayList<>();

    for (FieldAndArguments fieldAndArguments : environment.getFields()) {
      final Field field = fieldAndArguments.getField();
      if (!VALID_FIELDS.contains(field.getName())) {
        continue;
      }

      LOGGER.debug("Field: {}", field.getName());

      final String username = fieldAndArguments.getArgumentValue("username");

      if (Strings.isNullOrEmpty(username)) {
        errors.add(environment.mkError("username cannot be empty", fieldAndArguments));
      } else {
        final int length = username.codePointCount(0, username.length());

        if (length < USERNAME_MIN_LENGTH || length > USERNAME_MAX_LENGTH) {
          errors.add(
              environment.mkError(
                  String.format(
                      "username must be between %d and %d characters",
                      USERNAME_MIN_LENGTH, USERNAME_MAX_LENGTH),
                  fieldAndArguments));
        } else if (!username.matches("[A-Za-z0-9]+")) {
          errors.add(
              environment.mkError(
                  "username must only contain alphanumeric characters", fieldAndArguments));
        }
      }
    }

    return errors;
  }
