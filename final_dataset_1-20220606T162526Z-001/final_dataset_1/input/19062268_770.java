ResourceTemplate registerHandler(Class<?> targetClass) {
		Class<? extends ResourceHandler> handlerClass=toResourceHandlerClass(targetClass);
		checkArgument(!this.context.isRegistered(handlerClass),"Handler '%s' is already registered",handlerClass.getCanonicalName());
		return loadTemplates(handlerClass,this.context);
	}
