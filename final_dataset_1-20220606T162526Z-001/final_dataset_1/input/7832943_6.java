private Service listenTo(Service delegate) {
        delegate.addListener(new Listener() {
            @Override
            public void starting() {
                // Do nothing
            }

            @Override
            public void running() {
                // Do nothing
            }

            @Override
            public void stopping(State from) {
                // Do nothing
            }

            @Override
            public void terminated(State from) {
                closeLeaderLatch();
            }

            @Override
            public void failed(State from, Throwable failure) {
                closeLeaderLatch();
            }
        }, MoreExecutors.directExecutor());
        return delegate;
    }
