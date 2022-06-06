@Override
    public Collection<ValidationMessage> validate(final Path dataObjectPath,
                                                  final DataObject dataObject) {
        if (dataObject != null && dataObject.getAnnotation(PLANNING_SOLUTION_ANNOTATION) != null) {
            List<Path> planningSolutionUsages = assetsUsageService.getAssetUsages(PLANNING_SOLUTION_ANNOTATION,
                                                                                  ResourceType.JAVA,
                                                                                  dataObjectPath);
            // PlanningSolution already present in this object
            if (planningSolutionUsages.contains(dataObjectPath)) {
                return Collections.emptyList();
            }
            // Check other PlanningSolution usages
            if (!planningSolutionUsages.isEmpty()) {
                return Arrays.asList(new PlanningSolutionToBeDuplicatedMessage(Level.ERROR));
            }
        }
        return Collections.emptyList();
    }
