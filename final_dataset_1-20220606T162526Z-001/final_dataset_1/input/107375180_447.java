@Override
    public <T> T pull(Aspect<T> aspect) {
        if (aspect.isValuePresent()) {
            T staticValue = aspect.getValue();
            if (LinkkiAspectDefinition.DERIVED_BY_LINKKI.equals(staticValue)) {
                @SuppressWarnings("unchecked")
                T label = (T)findModelElement()
                        .map(this::getLabel)
                        .orElseGet(() -> (String)super.pull(aspect));
                return label;
            }
        }
        return super.pull(aspect);
    }
