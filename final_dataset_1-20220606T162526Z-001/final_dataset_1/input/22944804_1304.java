public void setStartIpAndEndIp(String startIp, String endIp) throws EntitlementException {

        T startIpValue = startIp == null ? initialStartIp : stringToIp(startIp);
        T endIpValue = endIp == null ? initialEndIp : stringToIp(endIp);

        if (isDefinedStartIp(startIpValue) && isDefinedEndIp(endIpValue)) {

            if (startIp.compareTo(endIp) > 0) {
                debugWarning("Validation: {0} is before {1}", END_IP, START_IP);
                throw new EntitlementException(END_IP_BEFORE_START_IP);
            }

        } else {

            if (isDefinedStartIp(startIpValue)) {
                debugWarning("Validation: Should define value for {1}, as value is defined for {0}", START_IP, END_IP);
                throw new EntitlementException(PAIR_PROPERTY_NOT_DEFINED, new String[]{START_IP, END_IP});
            }
            if (isDefinedEndIp(endIpValue)) {
                debugWarning("Validation: Should define value for {1}, as value is defined for {0}", END_IP, START_IP);
                throw new EntitlementException(PAIR_PROPERTY_NOT_DEFINED, new String[]{END_IP, START_IP});
            }
        }

        this.startIpString = startIp;
        this.startIp = startIpValue;
        this.endIpString = endIp;
        this.endIp = endIpValue;
    }
