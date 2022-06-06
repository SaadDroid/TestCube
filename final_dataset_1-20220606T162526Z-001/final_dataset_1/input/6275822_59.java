public static RestSettingBuilder delete(final RestIdMatcher idMatcher) {
        return single(HttpMethod.DELETE, checkNotNull(idMatcher, "ID Matcher should not be null"));
    }
