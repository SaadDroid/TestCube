public static boolean isValidIpv6String(String in) {
        IPv6 ip = new IPv6(in);
        try {
            ip.getBytes();
        } catch (IPStringConversionException ex) {
            return false;
        }
        return true;
    }
