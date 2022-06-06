public static boolean isIpWithtInCidrRange(final String ipAddress, final String cidr) {
        if (!isValidIp4(ipAddress)) {
            return false;
        }
        if (!isValidIp4Cidr(cidr)) {
            return false;
        }
        if (cidr.equals("0.0.0.0/0")) {
            return true;
        }

        // check if the gatewayip is the part of the ip range being added.
        // RFC 3021 - 31-Bit Prefixes on IPv4 Point-to-Point Links
        //     GW              Netmask         Stat IP        End IP
        // 192.168.24.0 - 255.255.255.254 - 192.168.24.0 - 192.168.24.1
        // https://tools.ietf.org/html/rfc3021
        // Added by Wilder Rodrigues
        final SubnetUtils subnetUtils = new SubnetUtils(cidr);
        subnetUtils.setInclusiveHostCount(true);

        final boolean isInRange = subnetUtils.getInfo().isInRange(ipAddress);

        return isInRange;
    }
