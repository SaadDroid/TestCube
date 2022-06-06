static void escape(PatternMatchNode exp) {
		Object pattern = exp.getOperand(1);
		if (pattern instanceof String) {
			// find _ or % and then attempt to escape...

			String pString = pattern.toString();

			int len = pString.length();
			for (int i = 0; i < len; i++) {

				char c = pString.charAt(i);
				if (c == WILDCARD_SEQUENCE || c == WILDCARD_ONE) {
					exp.setOperand(1, escapeFrom(exp, pString, i, len));
					break;
				}
			}
		}
	}
