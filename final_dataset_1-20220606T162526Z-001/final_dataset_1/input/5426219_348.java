public Multimap<String, String> conditionsPerDataColumnDescriptor(BaselineExperiment experiment) {
        return conditionsCollector.getConditions(experiment)
                .collect(flatteningToImmutableSetMultimap(
                        Condition::getAssayGroupId,
                        condition -> condition.getValues().stream()));
    }
