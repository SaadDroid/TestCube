@Override
    public String getLabel(Class<?> pmoClass, String propertyName, String aspectName, String fallbackValue) {
        return getLabel(pmoClass, PmoNlsService.getPropertyKey(pmoClass, propertyName, aspectName), fallbackValue);
    }
