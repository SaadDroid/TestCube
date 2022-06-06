public boolean equals(Object o) {
		if (!(o instanceof ConnectionKey)) {
			return false;
		}
		ConnectionKey other = (ConnectionKey) o;
		boolean sameProvider = providerId.equals(other.providerId);
		return providerUserId != null ? sameProvider && providerUserId.equals(other.providerUserId) : sameProvider && other.providerUserId == null;
	}
