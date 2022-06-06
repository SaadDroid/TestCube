public static long numberOfAddress(String cidrAddress) {
		SubnetInfo info = new SubnetUtils(cidrAddress).getInfo();
		// Need to use network and broadcast address to get whole range
		long lowestAddrAsLong = AddressUtils.ipv4ToLong(info.getNetworkAddress());
		long highestAddrAsLong = AddressUtils.ipv4ToLong(info.getBroadcastAddress());

		return (highestAddrAsLong - lowestAddrAsLong) + 1;
	}
