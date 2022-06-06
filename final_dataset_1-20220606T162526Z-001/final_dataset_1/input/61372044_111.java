public static Boolean isIpRangeListInCidr(final String ipRangeListExpression, final String cidr) {
        final String[] excludedIpsRangeDelimiters = ipRangeListExpression.split("[,-]");

        for (final String ip : excludedIpsRangeDelimiters) {
            if (!NetUtils.isIpWithtInCidrRange(ip, cidr)) {
                return false;
            }
        }
        return true;
    }
