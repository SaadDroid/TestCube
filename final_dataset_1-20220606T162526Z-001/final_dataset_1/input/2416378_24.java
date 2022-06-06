public static <T> T getExtra(Bundle extras, String name, boolean nullable) {
        T value = null;
        if (extras != null && extras.containsKey(name)) {
            value = (T)extras.get(name);
        }
        if (!nullable && value == null) {
            throw new TransfuseInjectionException("Unable to access Extra " + name);
        }
        return value;
    }
