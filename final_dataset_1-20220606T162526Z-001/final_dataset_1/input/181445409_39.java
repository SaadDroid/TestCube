@Override
    public InetSocketAddress getRemoteAddress() {
        SocketAddress address = delegate.remoteAddress();
        if (address == null) {
            return null;
        }
        return new InetSocketAddress(address.host(), address.port());
    }
