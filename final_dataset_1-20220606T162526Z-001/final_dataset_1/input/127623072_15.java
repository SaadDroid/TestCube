static Map<String, List<Method>> collectMethods(Class<?> type, Map<String, List<Method>> seenMethods) {
        // bail on recursion stop condition
        if (type == Object.class) {
            return seenMethods;
        }

        collectMethods(type.getSuperclass(), seenMethods);

        for (Method method : type.getDeclaredMethods()) {
            // skip static and abstract methods
            if(Modifier.isStatic(method.getModifiers()) || Modifier.isAbstract(method.getModifiers())) {
                continue;
            }
            // calculate method signature
            String methodSignature = getMethodSignature(method);

            // lookup for overridden method
            List<Method> parentMethods = seenMethods.computeIfAbsent(methodSignature, sig -> new ArrayList<>());
            parentMethods.removeIf(parentMethod -> isMethodOverride(parentMethod, method));
            parentMethods.add(method);
        }

        return seenMethods;
    }
