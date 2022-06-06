@Override
	public void describeTo(Description description)
	{
		if (matchers.isEmpty())
		{
			description.appendText(compositeDescription != null ? compositeDescription : "anything");
		}
		else
		{
			String start = (compositeDescription != null) ? compositeDescription + " " : "";
		
			description.appendList(start, SEPARATOR, "", matchers);
		}
	}
