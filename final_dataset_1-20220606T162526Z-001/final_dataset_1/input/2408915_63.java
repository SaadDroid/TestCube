@Override
	public void resolveAttributeIfExists(String attribute, AttributeResolver attributeResolver) {
		if (attributeMappings.containsKey(attribute)) {
			String attributeValue = attributeMappings.get(attribute);
			try {
				attributeResolver.resolve(view, attribute, attributeValue);
			} catch (AttributeResolutionException e) {
				resolutionErrors.addAttributeError(e);
			}

			attributeMappings.remove(attribute);
		}
	}
