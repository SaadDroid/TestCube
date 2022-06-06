@Override
    protected SslInfo initSslInfo() {
        if (delegate.sslSession() == null) {
            return null;
        }

        return new SslInfoImpl(delegate.sslSession());
    }
