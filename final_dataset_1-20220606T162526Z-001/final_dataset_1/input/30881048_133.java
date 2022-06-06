@Override
	public DrawableWriter get(String mimeType) {
		DrawableWriter writer = null;
		Class<? extends DrawableWriter> clazz = getTypeClass(mimeType);
		//IOCapabilities capabilities = getCapabilities(mimeType);
		try {
			if (clazz != null) {
				Constructor<? extends DrawableWriter> constructor =
					clazz.getDeclaredConstructor(String.class);
				writer = constructor.newInstance(mimeType);
			}
		} catch (SecurityException | InvocationTargetException | IllegalAccessException | InstantiationException | IllegalArgumentException | NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (writer == null) {
			throw new IllegalArgumentException(MessageFormat.format(
					"Unsupported MIME type: {0}", mimeType)); //$NON-NLS-1$
		}

		return writer;
	}
