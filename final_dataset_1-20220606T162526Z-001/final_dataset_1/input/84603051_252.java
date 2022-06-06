@Override
    public boolean isValid(ClusterNode localNode) {
        try {
            InetAddress address = InetAddress.getByName(host);

            boolean reachable = address.isReachable(timeout);

            if (reachable) {
                if (DEBUG) {
                    log.debug("Address reachability check success [host={}, timeout={}]", host, timeout);
                }
            } else {
                if (log.isWarnEnabled()) {
                    log.warn("Address reachability check failed [host={}, timeout={}]", host, timeout);
                }
            }

            return reachable;
        } catch (IOException e) {
            if (log.isWarnEnabled()) {
                log.warn("Address reachability check failed with an error [host={}, timeout={}, cause={}]", host, timeout, e.toString());
            }
        }

        return false;
    }
