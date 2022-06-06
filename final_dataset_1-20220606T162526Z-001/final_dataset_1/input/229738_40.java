public int[] execute() {
        final List<String> statements = getStatements();
        Batch b = handle.createBatch();
        statements.forEach(b::add);
        return b.execute();
    }
