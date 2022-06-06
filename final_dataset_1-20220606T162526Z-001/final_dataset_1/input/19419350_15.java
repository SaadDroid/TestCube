public static String formatPath(List<ChildNumber> path) {
        return PATH_JOINER.join(Iterables.concat(Collections.singleton("M"), path));
    }
