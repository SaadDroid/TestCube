@Override
    public <T> T execute(URI uri, final HttpRequest<T> request) throws ProtocolException, ProtocolError, IOException
    {
        return mDelegate.execute(uri, new FollowingRequest<>(request, uri));
    }
