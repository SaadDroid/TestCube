public static boolean isIpInCidrList(final InetAddress address, final String[] cidrlist) {
        boolean match = false;

        for (final String cidr : cidrlist) {
            try {
                if (address instanceof Inet6Address && isValidIp6Cidr(cidr)) {
                    if (isIp6InNetwork(IPv6Address.fromInetAddress(address), IPv6Network.fromString(cidr))) {
                        match = true;
                        break;
                    }
                } else if (address instanceof Inet4Address && isValidIp4Cidr(cidr)) {
                    if (NetUtils.isIpWithtInCidrRange(address.getHostAddress(), cidr)) {
                        match = true;
                        break;
                    }
                }
            } catch (final IllegalArgumentException e) {
                continue;
            }
        }
        return match;
    }
