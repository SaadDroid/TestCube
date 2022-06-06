public InetSocketAddress nextSeed() {
        // TODO: Prefer RETRY nodes if already tried all nodes.

        if (lastTried != null) {
            lastTried = seeds.stream()
                .filter(s -> s.status() != Status.BAN && !s.address().equals(localAddress) && compare(s.address(), lastTried) > 0)
                .findFirst()
                .map(SeedNodeState::address)
                .orElse(null);
        }

        if (lastTried == null) {
            lastTried = seeds.stream()
                .filter(s -> s.status() != Status.BAN && !s.address().equals(localAddress))
                .findFirst()
                .map(SeedNodeState::address)
                .orElse(null);
        }

        return lastTried;
    }
