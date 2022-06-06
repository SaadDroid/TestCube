@Override
	public String newInstance(int uniqueId) {
		return AddressUtils.longToIpv4(longFactory.newInstance(uniqueId));
	}
