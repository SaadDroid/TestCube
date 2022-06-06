public void setValue(Object object, Object newValue) throws PropertyException {
        // this will take care of primitives.
        if (newValue == null) {
            newValue = this.nullValue;
        }

        try {
            field.set(object, newValue);
        }
        catch (Throwable th) {
            throw new PropertyException(
                    "Error writing field: " + field.getName(),
                    this,
                    object,
                    th);
        }
    }
