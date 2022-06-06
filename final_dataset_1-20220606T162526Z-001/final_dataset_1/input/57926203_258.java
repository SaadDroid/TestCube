public static String convertIpAddress(IpAddress ip) {
        String ret = null;
        if (ip != null) {
            if (ip.getIpv4Address() != null) {
                ret = ip.getIpv4Address().getValue();
            } else if (ip.getIpv6Address() != null) {
                ret = ip.getIpv6Address().getValue();
            }
        }
        return ret;
    }
