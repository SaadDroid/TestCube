static long getCidrSizeFromString(final String cidrSize) throws CloudRuntimeException {
        long cidrSizeNum = -1;

        try {
            cidrSizeNum = Integer.parseInt(cidrSize);
        } catch (final NumberFormatException e) {
            throw new CloudRuntimeException("cidrsize is not a valid int: " + cidrSize, e);
        }
        if (cidrSizeNum > 32 || cidrSizeNum < 0) {// assuming IPv4
            throw new CloudRuntimeException("cidr size out of range: " + cidrSizeNum);
        }
        return cidrSizeNum;
    }
