public List<Integer> getAllPorts() {
        return addresses.stream().map(InetSocketAddress::getPort).distinct().collect(Collectors.toList());
    }
