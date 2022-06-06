T adapt(S value) {
		try {
			T result = resultClass.cast(adapterMethod.invoke(null, value));
			if(result==null) {
				throw new IllegalStateException(getAdapterFailureMessage("could not adapt value '%s",value));
			}
			return result;
		} catch (IllegalArgumentException e) {
			throw new IllegalStateException(getAdapterFailureMessage("should accept '%s'",value.getClass().getCanonicalName()),e);
		} catch (IllegalAccessException e) {
			throw new IllegalStateException(getAdapterFailureMessage("should be accesible"),e);
		} catch (InvocationTargetException e) {
			throw new IllegalStateException(getAdapterFailureMessage("failed while adapting value '%s'",value),e);
		}
	}
