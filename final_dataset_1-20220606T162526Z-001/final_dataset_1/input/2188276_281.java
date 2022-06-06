public void setUrl(String url) throws ValidationException
	{
		String data = getString(url);
		if (data.length() == 0)
		{
			throw new ValidationException(IStrings.ERR_BLANK_URL);
		}
		if (!data.equals(_url))
		{
			final String oldValue = _url;
			_url = data;
			getPropertyChangeReporter().firePropertyChange(
				ISQLDriver.IPropertyNames.URL,
				oldValue,
				_url);
		}
	}
