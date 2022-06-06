public String renderObject(Object value) {
		// use the Java default date-to-string
		if (useJavaDefaultFormat == true || value == null)
			return (String)_renderer.renderObject(value);

		// use a date formatter
		try
		{
		    return (String)_renderer.renderObject(dateFormat.format(value));
		}
		catch (Exception e)
		{
		    if(false == _renderExceptionHasBeenLogged)
		    {
		        _renderExceptionHasBeenLogged = true;
		        s_log.error("Could not format \"" + value + "\" as date type", e);
		    }
		    return (String) _renderer.renderObject(value);
		}
   }
