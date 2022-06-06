public static void checkForValidIpAddressFormat(String ipAddress) throws VmidcBrokerInvalidEntryException {
        if (!InetAddresses.isInetAddress(ipAddress)) {
            throw new VmidcBrokerInvalidEntryException("IP Address: '" + ipAddress + "' has invalid format.");
        }
    }
