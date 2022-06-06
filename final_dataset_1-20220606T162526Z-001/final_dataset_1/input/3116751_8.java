public OneParamValidator primitiveOrWrapper(TypeKind primitive) {
		return param(new PrimitiveOrWrapperParameterRequirement(primitive));
	}
