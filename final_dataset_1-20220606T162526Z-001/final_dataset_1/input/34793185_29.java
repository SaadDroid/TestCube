@Override
    public Collection<ValidationMessage> validate(final Path dataObjectPath,
                                                  final DataObject dataObject) {
        if (dataObject != null && dataObject.getAnnotation(PLANNING_SOLUTION_ANNOTATION) != null) {
            return Arrays.asList(new PlanningSolutionToBeDuplicatedMessage(Level.ERROR));
        }
        return Collections.emptyList();
    }
