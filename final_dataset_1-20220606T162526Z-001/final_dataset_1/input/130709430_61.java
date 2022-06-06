public List<String> tryToResolve(Method method) {
        String[] parameterNames = parameterNameDiscoverer.getParameterNames(method);
        if (isNull(parameterNames)) {
            return nCopies(method.getParameterCount(), null);
        }
        return asList(parameterNames);
    }
