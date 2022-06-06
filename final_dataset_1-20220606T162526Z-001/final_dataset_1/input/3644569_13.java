@Override
	public EntityMapping extract(Class<?> type) throws MappingException {
		if (type == null) {
			throw new NullPointerException("Cannot extract entity mapping, type is null!");
		}
		final Entity annotation = type.getAnnotation(Entity.class);
		if (annotation == null) {
			throw new MappingException(type, "not annotated with @Entity");
		}
		final EntityMappingImpl result = new EntityMappingImpl(type, type.getName());
		final Fields mappedFields = extractFields(type);
		result.setFields(mappedFields);
		if (result.getIdProperty() == null) {
			throw new MappingException("Type " + type.getName() + " does not have an ID property. Annotate one property with @Id.");
		}
		return result;
	}
