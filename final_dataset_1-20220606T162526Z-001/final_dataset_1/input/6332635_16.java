public static String globToRegExp(String glob) {
		StringBuilder buf = new StringBuilder();
		buf.append("^");
		for(int i = 0; i < glob.length(); i ++) {
			appendReplacement(glob.charAt(i), buf);
		}
		buf.append("$");
		return buf.toString();
	}
