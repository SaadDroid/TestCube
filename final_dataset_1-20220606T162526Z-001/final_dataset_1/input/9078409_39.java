public static Inet4Address getMappedIPv4Address(Inet6Address ip) {
        if (!isMappedIPv4Address(ip))
            throw new IllegalArgumentException(String.format("Address '%s' is not IPv4-mapped.", toAddrString(ip)));

        return getInet4Address(copyOfRange(ip.getAddress(), 12, 16));
    }
