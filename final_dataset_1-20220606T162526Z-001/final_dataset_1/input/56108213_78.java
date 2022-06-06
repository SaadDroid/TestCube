@Override
    public boolean exists() {
        return contains() || getDefaultValue() != null;
    }
