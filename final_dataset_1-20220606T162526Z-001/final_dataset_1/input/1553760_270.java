@Override
	public void beginSpan(SpanType type, Attributes attributes) {
		for (DocumentBuilder builder : builders) {
			builder.beginSpan(type, attributes);
		}
	}
