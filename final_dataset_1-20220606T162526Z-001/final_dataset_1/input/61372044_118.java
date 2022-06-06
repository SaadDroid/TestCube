public static boolean isLocalAddress(final String address) throws UnknownHostException {
        final InetAddress inetAddress = InetAddress.getByName(address);
        return inetAddress.isLinkLocalAddress() || inetAddress.isAnyLocalAddress() || inetAddress.isLoopbackAddress();
    }
