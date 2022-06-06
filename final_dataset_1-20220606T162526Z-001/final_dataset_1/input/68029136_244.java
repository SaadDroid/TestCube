protected Map<String, FreeMarkerProperty> translatePropertyList(final List<PropertyEntity> properties, final String name, final Integer id, final Integer groupId, final String release, final String outOfServiceRelease) {
		final Map<String, FreeMarkerProperty> result = new TreeMap<>();
		if (properties != null) {
			for (final PropertyEntity p : properties) {
				// do not add Properties, which are KeyOptional and no Value is set
				if(p.getDescriptor().isOptional()){
					if(p.hasValue()){
						result.put(p.getDescriptor().getPropertyName(), p.toFreemarkerProperty());
					}
				} else {
					result.put(p.getDescriptor().getPropertyName(), p.toFreemarkerProperty());
				}
			}
		}
		if (name != null) {
			result.put(RESERVED_PROPERTY_NAME,  new FreeMarkerProperty(name, RESERVED_PROPERTY_NAME));
		}
		if (id != null) {
			result.put(RESERVED_PROPERTY_ID,  new FreeMarkerProperty(id.toString(), RESERVED_PROPERTY_ID));
		}
		if (release != null) {
			result.put(RESERVED_PROPERTY_RELEASE,  new FreeMarkerProperty(release, RESERVED_PROPERTY_RELEASE));
		}
		if(groupId !=null){
		     result.put(RESERVED_PROPERTY_GROUP_ID,  new FreeMarkerProperty(groupId.toString(), RESERVED_PROPERTY_GROUP_ID));
		}
		if(outOfServiceRelease != null){
			result.put(RESERVED_PROPERTY_OUT_OF_SERVICE,  new FreeMarkerProperty(outOfServiceRelease, RESERVED_PROPERTY_OUT_OF_SERVICE));
		}
		return result;
	}
