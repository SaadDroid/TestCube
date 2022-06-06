public static Expression likeIgnoreCaseExp(String pathSpec, Object value) {
		return likeIgnoreCaseExpInternal(pathSpec, value, (char) 0);
	}
