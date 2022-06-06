static boolean equalsIgnoreCase(final CharSequence str1, final CharSequence str2) {
		if(str1==str2) {
			return true;
		} else if(str1==null||str2==null) {
			return false;
		} else if(str1.length()!=str2.length()) {
			return false;
		} else {
			return regionMatches(str1,true,0,str2,0,str1.length());
		}
	}
