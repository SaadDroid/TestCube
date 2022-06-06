@SuppressWarnings("unchecked")
    @Override
    public <T> T pull(Aspect<T> aspect) {
        if (aspect.isValuePresent()) {
            T staticValue = aspect.getValue();
            Object boundObject = getBoundObject();
            if (staticValue instanceof String && boundObject != null) {
                Class<?> pmoClass = getTypeForKey(boundObject);
                staticValue = (T)PmoNlsService.get()
                        .getLabel(pmoClass, getProperty(), aspect.getName(), (String)staticValue);
            }
            if (LinkkiAspectDefinition.DERIVED_BY_LINKKI.equals(staticValue)) {
                return (T)StringUtils.capitalize(getProperty());
            }
            return staticValue;
        } else {
            return super.pull(aspect);
        }
    }
