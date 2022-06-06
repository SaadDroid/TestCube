public static Hasher withDefaults() {
        return new Hasher(Version.VERSION_2A, new SecureRandom(), LongPasswordStrategies.strict(Version.VERSION_2A));
    }
