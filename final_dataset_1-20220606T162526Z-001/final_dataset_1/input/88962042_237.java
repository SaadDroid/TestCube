JavaClasses getClassesToAnalyzeFor(Class<?> testClass, ClassAnalysisRequest classAnalysisRequest) {
        checkNotNull(testClass);
        checkNotNull(classAnalysisRequest);

        if (cachedByTest.containsKey(testClass)) {
            return cachedByTest.get(testClass);
        }

        LocationsKey locations = RequestedLocations.by(classAnalysisRequest, testClass).asKey();

        JavaClasses classes = classAnalysisRequest.getCacheMode() == FOREVER
                ? cachedByLocations.getUnchecked(locations).get()
                : new LazyJavaClasses(locations.locations, locations.importOptionTypes).get();

        cachedByTest.put(testClass, classes);
        return classes;
    }
