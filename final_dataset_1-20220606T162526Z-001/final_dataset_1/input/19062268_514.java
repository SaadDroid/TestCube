static boolean isValidTermName(String string) {
		if(string==null) {
			return false;
		}
		return Pattern.matches("^\\p{javaUpperCase}[_\\p{javaUpperCase}]*$", string);
	}
