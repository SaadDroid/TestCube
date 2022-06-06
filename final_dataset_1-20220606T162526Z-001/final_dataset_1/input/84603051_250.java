@Override
    public boolean isValid(ClusterNode localNode) {
        try (Socket socket = new Socket()) {
            InetAddress resolvedHost = InetAddress.getByName(address.getHostString());

            InetSocketAddress resolvedAddress = new InetSocketAddress(resolvedHost, address.getPort());

            socket.connect(resolvedAddress, timeout);

            if (DEBUG) {
                log.debug("Address reachability check success [host={}, timeout={}]", address, timeout);
            }

            return true;
        } catch (IOException e) {
            if (log.isWarnEnabled()) {
                log.warn("Address reachability check failed [host={}, timeout={}, error={}]", address, timeout, e.toString());
            }
        }

        return false;
    }
