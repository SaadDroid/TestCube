public static Set<String> stringToSet(String string) {
        if (string == null || string.isEmpty()) {
            return Collections.emptySet();
        }
        return new HashSet<String>(Arrays.asList(string.split(" ")));
    }
