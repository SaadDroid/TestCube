@Override
    public MatchTable<E, T> fullMatch(Set<E> source, Set<E> target) {
        return match(source, target, true);
    }
