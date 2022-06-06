static List<Proxy> getProxiesFromPacResult(final String pacString) {
        if (pacString == null) {
            return Collections.singletonList(Proxy.NO_PROXY);
        }
        final String[] tokens = pacString.split(";");
        return Stream.of(tokens)
                .map(token -> token.trim())
                .map(token -> {
                    if (token.startsWith(PROXY)) {
                        return getInetSocketAddress(token)
                                .map(sa -> new Proxy(Proxy.Type.HTTP, sa))
                                .orElseThrow(() -> new IllegalArgumentException("HTTP Proxy must be specified with valid address"));
                    } else if (token.startsWith(SOCKS)) {
                        return getInetSocketAddress(token)
                                .map(sa -> new Proxy(Proxy.Type.SOCKS, sa))
                                .orElseThrow(() -> new IllegalArgumentException("SOCKS Proxy must be specified with valid address"));
                    } else if (token.startsWith(DIRECT)) {
                        return Proxy.NO_PROXY;
                    } else {
                        throw new IllegalArgumentException("Unrecognized proxy token: " + token);
                    }
                }).collect(Collectors.toList());
    }
