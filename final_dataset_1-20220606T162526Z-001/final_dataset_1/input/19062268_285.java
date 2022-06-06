public static QualifiedName parse(final CharSequence item) {
		QualifiedName result=null;
		final int colon = findValidPartition(item);
		if(colon>Integer.MIN_VALUE) {
			result=assemble(item, colon);
		}
		return result;
	}
