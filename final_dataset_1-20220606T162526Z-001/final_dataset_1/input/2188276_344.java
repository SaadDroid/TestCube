public static boolean isProgress(ISQLDatabaseMetaData md)
	{
		return dialectSupportsProduct(md, progressDialect);
	}
