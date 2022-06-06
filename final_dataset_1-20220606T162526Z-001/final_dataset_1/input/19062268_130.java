static boolean regionMatches(
			final CharSequence target,
			final boolean ignoreCase,
			final int toffset,
			final CharSequence other,
			final int ooffset,
			final int length) {
		boolean result;
		if (target instanceof String && other instanceof String) {
			result=delegateCheck((String)target,ignoreCase,toffset,ooffset,length,(String) other);
		} else {
			result=carryOutCheck(target, ignoreCase, toffset, other, ooffset, length);
		}
		return result;
	}
