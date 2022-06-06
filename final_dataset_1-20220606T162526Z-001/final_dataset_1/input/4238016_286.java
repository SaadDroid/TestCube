@Override
	public int hashCode() {
		return new HashCodeBuilder()
			.append(parentPagePath)
			.append(title)
			.append(data)
			.append(contentType)
			.append(tags)
			.append(viewRestrictionRole)
			.toHashCode();
	}
