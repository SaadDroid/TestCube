@SuppressWarnings("unchecked")
    @Override
    public boolean marathon_select(String value) {
        Spinner<?> spinner = (Spinner<?>) getComponent();
        if (!spinner.isEditable()) {
            @SuppressWarnings("rawtypes")
            SpinnerValueFactory factory = ((Spinner<?>) getComponent()).getValueFactory();
            Object convertedValue = factory.getConverter().fromString(value);
            factory.setValue(convertedValue);
            return true;
        }
        TextField spinnerEditor = spinner.getEditor();
        if (spinnerEditor == null) {
            throw new JavaAgentException("Null value returned by getEditor() on spinner", null);
        }
        IJavaFXElement ele = JavaFXElementFactory.createElement(spinnerEditor, driver, window);
        spinnerEditor.getProperties().put("marathon.celleditor", true);
        ele.marathon_select(value);
        return true;
    }
