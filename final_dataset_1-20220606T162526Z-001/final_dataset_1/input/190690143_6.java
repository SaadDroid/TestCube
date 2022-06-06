public Object call(Object self, Object[] args) {

		try {
			Object[] callArgs = new Object[args.length];
			Class<?>[] argTypes = proxiedFunction.getParameterTypes();

			for(int i=0; i<args.length; i++) {
				if(args[i].getClass() == argTypes[i]) {
					callArgs[i] = args[i];
				} else {
					callArgs[i] = convertArg(args[i], argTypes[i]);
				}
			}

			return proxiedFunction.invoke(self, callArgs);
		} catch (IllegalAccessException | InvocationTargetException e) {
			throw new IllegalStateException("Could not invoke API method "+proxiedFunction+" on object "+self, e);
		}
	}
