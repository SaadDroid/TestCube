@Override
	public boolean equals(Object o) {
		if (o == this) {
			return true;
		} else if ((o != null) && o.getClass().equals(getClass())) {
			Page other = (Page) o;
			return new EqualsBuilder()
				.append(parentPagePath, other.parentPagePath)
				.append(title, other.title)
				.append(data, other.data)
				.append(contentType, other.contentType)
				.append(tags, other.tags)
				.append(viewRestrictionRole, other.viewRestrictionRole)
				.isEquals();
		}
		return false;
	}
