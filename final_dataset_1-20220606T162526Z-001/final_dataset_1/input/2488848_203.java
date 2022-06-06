@Override
    public void update(Collection<STMT> removedStatements, Collection<STMT> addedStatements) {
        // TODO : add bulk handling
        if (removedStatements != null && !removedStatements.isEmpty()) {
            for (STMT stmt : removedStatements) {
                graph.delete(convert(stmt));
            }
        }
        if (addedStatements != null && !addedStatements.isEmpty()) {
            for (STMT stmt : addedStatements) {
                graph.add(convert(stmt));
            }
        }

    }
