@Override
    public <T> Collection<? extends T> getBeansOfType(Class<T> type) {
        return locators.stream()
                .map(beanLocator -> beanLocator.<T>getBeansOfType(type))
                .filter(Objects::nonNull)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }
