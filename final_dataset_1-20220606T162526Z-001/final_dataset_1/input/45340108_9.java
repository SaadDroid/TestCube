public static <T extends FieldMetadata> void updateObject(T from, T to) throws IllegalStateException {
		Validate.notNull(from);
		Validate.notNull(to);

		// Only go through the process if the objects are not the same reference
		if(to == from) {
			return;
		}
		Class<?> originalClass = to.getClass();
		Class<?> updateClass = from.getClass();
		// you may want to work this check if you need to handle polymorphic relations
		if(!originalClass.equals(updateClass)) {
			throw new IllegalArgumentException("Received objects are not the same type of class");
		}

		List<PropertyDescriptor> descriptors = getDescriptors(originalClass);

		for(PropertyDescriptor descriptor : descriptors) {
			updateProperty(to, from, descriptor);
		}
	}
