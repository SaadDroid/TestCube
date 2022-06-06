public static boolean includes(final Language language1, final Language language2) {
		if(language1==null || language2==null) {
			return false;
		}
		if(language1.isWildcard()) {
			return true;
		}
		if(language2.isWildcard()) {
			return false;
		}
		return
			language1.primaryTag().equals(language2.primaryTag()) &&
			(language1.subTag().isEmpty() || language1.subTag().equals(language2.subTag()));
	}
