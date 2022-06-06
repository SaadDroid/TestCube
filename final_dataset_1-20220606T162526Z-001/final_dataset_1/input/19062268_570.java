public static void setInstance(final RuntimeDelegate delegate) {
		SecurityManager security = getSecurityManager();
		if (security != null) {
			security.checkPermission(SUPPRESS_ACCESS_CHECKS_PERMISSION);
		}
		synchronized(RuntimeDelegate.CACHED_DELEGATE) {
			RuntimeDelegate.CACHED_DELEGATE.set(delegate);
		}
	}
