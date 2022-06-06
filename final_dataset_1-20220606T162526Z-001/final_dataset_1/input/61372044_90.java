public static boolean is31PrefixCidr(final String cidr) {
        final boolean isValidCird = isValidIp4Cidr(cidr);
        if (isValidCird) {
            final String[] cidrPair = cidr.split("\\/");
            final String cidrSize = cidrPair[1];

            final int cidrSizeNum = Integer.parseInt(cidrSize);
            if (cidrSizeNum == RFC_3021_31_BIT_CIDR) {
                return true;
            }
        }
        return false;
    }
