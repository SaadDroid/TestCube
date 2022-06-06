public boolean formatsException(Throwable t)
	{
		if (t == null)
		{
			return false;
		}
		else
		{
			String className = t.getClass().getName();
			return className.startsWith(JCC_EXCEPTION_PREFIX) && className.endsWith(JCC_EXCEPTION_CLASS);
		}
	}
