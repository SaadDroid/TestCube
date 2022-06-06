@Override
    @PublicAPI(usage = ACCESS)
    public boolean isAnnotatedWith(Class<? extends Annotation> annotationType) {
        if (packageInfo.isPresent()) {
            return packageInfo.get().isAnnotatedWith(annotationType);
        }
        return false;
    }
