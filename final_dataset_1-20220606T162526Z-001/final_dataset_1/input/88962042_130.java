@PublicAPI(usage = ACCESS)
    public JavaClasses that(DescribedPredicate<? super JavaClass> predicate) {
        Map<String, JavaClass> matchingElements = Guava.Maps.filterValues(classes, predicate);
        String newDescription = String.format("%s that %s", description, predicate.getDescription());
        return new JavaClasses(defaultPackage, matchingElements, newDescription);
    }
