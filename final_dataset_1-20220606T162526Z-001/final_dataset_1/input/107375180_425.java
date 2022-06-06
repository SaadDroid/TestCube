@Override
    public Stream<?> getChildComponents(Object uiComponent) {
        if (uiComponent instanceof HasComponents) {
            return StreamUtil.stream((HasComponents)uiComponent);
        }
        return Stream.empty();
    }
