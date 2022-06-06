public Set<String> resolve(GenericApplicationContext applicationContext, String beanName) {
        String[] beanNamesForType = applicationContext.getBeanNamesForType(EclairLogger.class);
        if (!asList(beanNamesForType).contains(beanName)) {
            throw new IllegalArgumentException(format("EclairLogger '%s' not found", beanName));
        }
        Set<String> result = new HashSet<>(asList(applicationContext.getAliases(beanName)));
        result.add(beanName);
        if (beanNamesForType.length == 1 || applicationContext.getBeanDefinition(beanName).isPrimary()) {
            result.add("");
        }
        return result;
    }
