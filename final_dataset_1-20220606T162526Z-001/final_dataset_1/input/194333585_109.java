@Override
    public Collection<Pair<Mutation, byte[]>> getIndexUpdate(Mutation mutation, IndexMetaData indexMetaData) throws IOException {
    	// create a state manager, so we can manage each batch
        LocalTableState state = new LocalTableState(localTable, mutation);
        // build the index updates for each group
        IndexUpdateManager manager = new IndexUpdateManager(indexMetaData);

        batchMutationAndAddUpdates(manager, state, mutation, indexMetaData);

        if (LOG.isTraceEnabled()) {
            LOG.trace("Found index updates for Mutation: " + mutation + "\n" + manager);
        }

        return manager.toMap();
    }
