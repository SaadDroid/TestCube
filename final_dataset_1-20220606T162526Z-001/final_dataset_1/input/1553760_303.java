public void setElementNameOfSpanType(SpanType spanType, String elementName) {
		Objects.requireNonNull(spanType, "Must provide spanType"); //$NON-NLS-1$
		Objects.requireNonNull(elementName, "Must provide elementName"); //$NON-NLS-1$

		ImmutableMap.Builder<SpanType, String> builder = ImmutableMap.builder();
		for (Entry<SpanType, String> entry : spanTypeToElementName.entrySet()) {
			if (!entry.getKey().equals(spanType)) {
				builder.put(entry);
			}
		}
		builder.put(spanType, elementName);

		spanTypeToElementName = builder.build();
	}
