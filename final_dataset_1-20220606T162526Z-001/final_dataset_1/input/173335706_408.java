public static String getHost() {
        if (HOST_ADDRESS != null) {
            return HOST_ADDRESS;
        }

        InetAddress address = getLocalAddress();
        if (address != null) {
            HOST_ADDRESS = address.getHostAddress();
            return HOST_ADDRESS;
        }
        return LOCAL_HOST_VALUE;
    }
