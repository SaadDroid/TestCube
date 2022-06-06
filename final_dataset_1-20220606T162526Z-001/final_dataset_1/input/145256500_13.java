@Nullable
  @Override
  public T get(CommandArgs arguments, List<? extends Annotation> modifiers)
      throws ArgumentException, ProvisionException {
    String name = arguments.next();
    String test = simplify(name);

    for (T entry : enumClass.getEnumConstants()) {
      if (simplify(entry.name()).equalsIgnoreCase(test)) {
        return entry;
      }
    }

    throw new ArgumentParseException(
        "No matching value found in the '" + enumClass.getSimpleName() + "' list.");
  }
