public static final boolean isValidIpv4Subnet(String in) {
        String ip;
        String subnet;
        Matcher ipMatcher;
        if (in == null) {
            return false;
        }

        ipMatcher = subnetPattern.matcher(in);
        int subnetint;
        if (ipMatcher.find()) {
            ip = ipMatcher.group(1);
            subnet = ipMatcher.group(2);
            try {
                subnetint = Integer.parseInt(subnet);
                if (subnetint < 0 || subnetint > 32 || !isValidIpv4String(ip)) {
                    return false;
                }
                return true;
            } catch (NumberFormatException e) {
                return false;
            }

        }
        return false;
    }
