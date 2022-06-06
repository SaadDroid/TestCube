@Override
    public ListenableFuture<Void> saveAsync(P pojo) {
        return completeAsync(group -> save(group, StatementOptionsBuilder.empty(), pojo, defaultTtl));
    }
