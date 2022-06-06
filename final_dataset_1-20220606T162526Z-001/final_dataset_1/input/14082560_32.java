@Override
    public MatchTable<E, T> partialMatch(Set<E> source, Set<E> target) {
        return match(source, target, false);
    }
