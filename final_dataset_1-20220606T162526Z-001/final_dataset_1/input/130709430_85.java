public <T> Map<String, String> getAliases(ListableBeanFactory beanFactory, Class<T> clazz) {
        return beanFactory.getBeansOfType(clazz).keySet().stream()
                .map(name -> getAliasEntrySet(beanFactory, name))
                .flatMap(Collection::stream)
                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
