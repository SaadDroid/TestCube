public static <T> T newStubInstance(
		Class<? extends T> stubClass, String id,
		RegistrationReference registrationReference,
		ExceptionHandler exceptionHandler) {

		try {
			Constructor<? extends T> constructor = stubClass.getConstructor(
				String.class, RegistrationReference.class,
				ExceptionHandler.class);

			return constructor.newInstance(
				id, registrationReference, exceptionHandler);
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
