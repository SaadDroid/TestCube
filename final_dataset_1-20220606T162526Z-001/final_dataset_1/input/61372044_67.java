public static String getNextIp6InRange(final String currentIp, final String ipRange) {
        final String[] ips = ipRange.split("-");
        final String startIp = ips[0];
        String endIp = null;
        if (ips.length > 1) {
            endIp = ips[1];
        }
        final IPv6Address start = IPv6Address.fromString(startIp);
        final IPv6Address end = IPv6Address.fromString(endIp);
        final IPv6Address current = IPv6Address.fromString(currentIp);
        IPv6Address result = null;
        if (current.equals(end)) {
            result = start;
        } else {
            result = current.add(1);
        }
        String resultIp = null;
        if (result != null) {
            resultIp = result.toString();
        }
        return resultIp;
    }
