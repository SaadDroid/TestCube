@Override
	public Function find(String functionName, Class<?>... parameterTypes) {
		Method method = MethodUtils.getMatchingAccessibleMethod(beanClass, functionName, parameterTypes);
		
		if(method == null) {
			return null;
		}
		
		MethodDescriptor methodDescriptor = new MethodDescriptor(method.getName(), method.getParameterTypes());
		if(!functions.containsKey(methodDescriptor)) {
			throw new RuntimeException("No such method '"+new MethodDescription(beanClass, method)+"'");
		}
		
		Function function = functions.get(methodDescriptor);
		
		if (function == null) {
			function = supply.tryToCreateFunction(methodDescriptor);
			if(function == null) {
				throw new Bug(MessageFormat.format("The method '{0}' is not generated",  new MethodDescription(beanClass, method)));
			}

			functions.put(methodDescriptor, function);
		}

		return function;
	}
