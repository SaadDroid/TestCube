@Override
    public boolean supports(Class<?> aClass) {
        return resourceRelationDescriptors.keySet().contains(aClass);
    }
