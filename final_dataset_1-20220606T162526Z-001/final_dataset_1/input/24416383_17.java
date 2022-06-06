@Override
	public boolean matches(String s1, String s2) {
		logger.trace("s1 {}; s2 {}", s1, s2);
		if (s1 == null && s2 == null) return true;
		String[] a1 = convToArray(s1);
		String[] a2 = convToArray(s2);
		return calculateTokensInCommon(a1,a2);
	}
