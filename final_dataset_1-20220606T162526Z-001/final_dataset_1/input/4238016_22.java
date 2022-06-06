public static void setAuthenticationCreationTime(HttpSession session, long time) {
		session.setAttribute(AUTHENTICATION_CREATION_TIME, time);
	}
