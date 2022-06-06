public synchronized void showErrorMessage(final Throwable th, 
                                              ExceptionFormatter formatter)
	{
		if (th == null)
		{
            throw new IllegalArgumentException("th cannot be null");
		}
        privateShowMessage(th, formatter, _saSetError);
	}
