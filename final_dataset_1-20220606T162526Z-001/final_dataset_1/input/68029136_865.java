public String nextFreeIdentifier(List<String> identifiers, String prefix, Integer count) {
		if (identifiers.size() <= 0) {
			return prefix;
		}
		else if (count == null) {
			return nextFreeIdentifier(identifiers, prefix, identifiers.size());
		}
		else {
			String sPrefix = !StringUtils.isBlank(prefix) ? prefix : "";
			String nextIdentifier = sPrefix + "_" + String.valueOf(count);

			if (identifiers.contains(nextIdentifier)) {
				return nextFreeIdentifier(identifiers, prefix, count + 1);
			}
			return nextIdentifier;
		}
	}
