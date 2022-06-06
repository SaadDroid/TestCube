@Override
    public boolean test(final I input) {
        if (components == null || components.isEmpty()) {
            return true;
        } else {
            return super.test(input);
        }
    }
