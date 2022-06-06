@Override
    public void applyTo(ServerDriverHttpUriRequest request) {
        request.setConnectionTimeout(timeout);
    }
