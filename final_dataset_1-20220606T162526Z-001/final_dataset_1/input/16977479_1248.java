@Override
    public boolean isWriteable(Class<?> type, Type genericType, Annotation[] anns, MediaType mt) {
        // JAXB support is required
        if (!super.isWriteable(type, genericType, anns, mt)) {
            return false;
        }
        if (InjectionUtils.isSupportedCollectionOrArray(type)) {
            return supportJaxbOnly;
        }

        // if the user has set the list of out classes and a given class
        // is in that list then it can only be handled by the template
        if (outClassCanBeHandled(type.getName()) || outClassesToHandle == null && !supportJaxbOnly) {
            return outTemplatesAvailable(type, anns, mt);
        }
        return supportJaxbOnly;
    }
