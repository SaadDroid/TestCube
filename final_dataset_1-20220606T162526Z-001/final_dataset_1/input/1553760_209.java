@Override
	public void beginSpan(DocumentBuilder builder, SpanType unsupportedType, Attributes attributes) {
		Attributes attributesCopy = attributes.clone();
		attributesCopy.setCssStyle(null);
		super.beginSpan(builder, unsupportedType, attributesCopy);
	}
