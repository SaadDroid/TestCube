@Deprecated
    public void setIpRange(List<String> ipRanges) throws EntitlementException {
        ipRange.clear();
        ipList.clear();
        if (ipRanges != null) {
            for (String ipRange : ipRanges) {
                StringTokenizer st = new StringTokenizer(ipRange, "-");
                int tokenCount = st.countTokens();
                if (tokenCount == 0) {
                    return;
                }
                if (tokenCount > 2) {
                    throw new EntitlementException(INVALID_PROPERTY_VALUE, new String[]{IP_RANGE, ipRange});
                }

                String startIp = st.nextToken();
                this.ipRange.add(startIp);
                ipList.add(stringToIp(startIp));
                if (tokenCount == 2) {
                    String endIp = st.nextToken();
                    this.ipRange.add(endIp);
                    ipList.add(stringToIp(endIp));
                }
            }
        }
    }
