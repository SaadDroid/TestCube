@Override
	public boolean matches(String s1, String s2) {
		if (nullToBlank && s1 == null) s1 = "";
		if (nullToBlank && s2 == null) s2 = "";

		return s1.equals(s2);
	}
