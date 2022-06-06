public static <T> ConditionRoot<T> criteriaFor(Class<T> clazz) {
        return new ConditionalCriteriaBuilder<T>().new RootBuilderImpl();
    }
