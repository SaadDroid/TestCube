private MatchTable<E, T> match(Set<E> source, Set<E> target, boolean full){
        // Compute partial match using the decorated match function
        MatchTable<E,T> result = new MatchTable<E, T>();
        for(E y : target){
            for(E x : source){
                T matchType = decoratedMatcher.match(x,y);
                if (matchType != null){
                    result.addMatch(x,y,matchType);
                    // We found a match between x and y.
                    // Skip to the next target element
                    if (!full) break;
                }
            }
        }
        return result;
    }
