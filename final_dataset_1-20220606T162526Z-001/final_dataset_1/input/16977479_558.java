@Override
    public WebTarget target(UriBuilder builder) {
        checkNull(builder);
        checkClosed();

        return new WebTargetImpl(builder, getConfiguration());
    }
