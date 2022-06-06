@Override
    public <T> T unwrap(Class<T> clazz) {
        return Session.class.isAssignableFrom(clazz) ? clazz.cast(session) : null;
    }
