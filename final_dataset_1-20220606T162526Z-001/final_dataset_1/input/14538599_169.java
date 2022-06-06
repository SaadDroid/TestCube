@Override
    public ListenableFuture<Void> completeAsync() {
        return Futures.transform(session.executeAsync(batchStatement), (Function<ResultSet, Void>) input -> null, executor);
    }
