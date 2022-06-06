public Set<Long> getSessions(String path) {
        Set<Long> s = path2Ids.get(path);
        return s != null ? Collections.unmodifiableSet(s) : null;
    }
