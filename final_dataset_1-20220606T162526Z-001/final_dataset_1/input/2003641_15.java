public Operation parseMethod(
            Method method,
            List<Parameter> globalParameters,
            JsonView jsonViewAnnotation) {
        JavaType classType = TypeFactory.defaultInstance().constructType(method.getDeclaringClass());
        return parseMethod(
                classType.getClass(),
                method,
                globalParameters,
                null,
                null,
                null,
                null,
                new ArrayList<>(),
                Optional.empty(),
                new HashSet<>(),
                new ArrayList<>(),
                false,
                null,
                null,
                jsonViewAnnotation,
                null,
                null);
    }
