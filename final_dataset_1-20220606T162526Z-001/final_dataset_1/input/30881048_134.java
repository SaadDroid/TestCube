@SuppressWarnings("unchecked")
	public IOCapabilities getCapabilities(String mimeType) {
		Class<? extends T> clazz = entries.get(mimeType);
		try {
			Method capabilitiesGetter =
				clazz.getMethod("getCapabilities"); //$NON-NLS-1$
			Set<IOCapabilities> capabilities =
				(Set<IOCapabilities>) capabilitiesGetter.invoke(clazz);
			for (IOCapabilities c : capabilities) {
				if (c.getMimeType().equals(mimeType)) {
					return c;
				}
			}
		} catch (SecurityException | InvocationTargetException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}
