protected static <T extends ChallengeHandler> T create(Class<T> clazz) {
        return load0(clazz, ServiceLoader.load(clazz));
    }
