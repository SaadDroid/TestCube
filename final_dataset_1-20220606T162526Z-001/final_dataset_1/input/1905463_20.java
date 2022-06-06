@Override
	/** {@inheritDoc} */
	public ValidationResult validateElExpression(String elExpression, AttributeInfo attributeInfo) {
		if (METHOD_BINDING_ATTRIBUTES.contains(attributeInfo.getAttributeName())) {
			return validateMethodElExpression(elExpression);
		} else {
			return validateValueElExpression(elExpression);
		}
	}
