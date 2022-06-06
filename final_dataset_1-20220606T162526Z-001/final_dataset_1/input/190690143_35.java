protected void createDescription(StringBuilder builder) {
		boolean prependComma = false;
		for(String name : entries.keySet()) {
			if(prependComma) {
				builder.append(",");
			}
			builder.append("\"").append(name).append("\":");
			entries.get(name).createDescription(builder);
			prependComma = true;
		}
	}
