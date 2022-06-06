@SuppressWarnings("unchecked")
    public List<PropertyDescription> createPropertyDescriptions(Class<?> componentClass) {
        List<PropertyDescription> propertyDescriptions = new ArrayList<>();

        Set<Field> propertyFields = getAllFields(componentClass, withAnnotation(Property.class));
        for (Field propertyField : propertyFields) {
            Property property = propertyField.getAnnotation(Property.class);
            PropertyDescription propertyDescription = new PropertyDescription(property.name(), property.description(), property.mandatory(), fromType(propertyField.getType()));
            if (PropertyType.ENUM.equals(propertyDescription.getType())) {
                List<String> enumValues = retrieveEnumValues(propertyField);
                propertyDescription.setAcceptedValues(enumValues);
            }

            propertyDescriptions.add(propertyDescription);
        }

        return propertyDescriptions;
    }
