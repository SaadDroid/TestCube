@Override
	public SingleResult generate(Class<?> javaClass) throws SingleFileGeneratorException {
		List<String> constants = new ArrayList<>();
		for (Enum constant : ((Class<Enum<?>>) javaClass).getEnumConstants()) {
			constants.add(constant.name());
		}
		
		StjsJavaScriptClassBuilder builder = new StjsJavaScriptClassBuilder(javaClass)
				.enumeration(javaClass, constants.toArray(new String[]{})).newLine();
		
		Map<String, Object> enumConstValueGetters = getEnumConstValueGetters((Class<Enum<?>>) javaClass);
		for(String constantAndGetterName : enumConstValueGetters.keySet()) {
			builder.staticFunction(javaClass, constantAndGetterName)
				.code("return ").literal(enumConstValueGetters.get(constantAndGetterName)).semicolon()
			._function();
		}
		
		return new JavaScriptResult(builder.create());
	}
