public boolean contains(String ip) throws IPStringConversionException, IpTypeMissMatchException {
        boolean out;
        if(!IPUtils.isValidIpv6String(ip)) {
            return false;
        }
        byte[] theirBytes = new IPv6(ip).getBytes();
        byte[] mySubnet = IPUtils.opBytes(ipBytes, maskBytes, ByteStreamOperation.AND);
        byte[] theirSubnet = IPUtils.opBytes(theirBytes, maskBytes, ByteStreamOperation.AND);
        out = IPUtils.bytesEqual(theirSubnet, mySubnet);
        return out;
    }
