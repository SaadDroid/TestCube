public static String getIpAddress(final Enumeration<NetworkInterface> nis) {
        while (nis.hasMoreElements()) {
            final NetworkInterface ni = nis.nextElement();
            final String address = getIpAddress(ni);
            if (address != null && !address.startsWith("127.") && !address.startsWith("169.")) {
                return address;
            }
        }
        return null;
    }
