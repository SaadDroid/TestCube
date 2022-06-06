public void addConverter(Converter<T> converter)
	{
		if(converter == null)
		{
			throw new IllegalArgumentException("Converter must not be null!");
		}
		Class clazz = converter.getSourceClass();
		if(clazz == null)
		{
			throw new IllegalStateException("Converter "+converter+" did not return a source class!");
		}

		synchronized(converterMap)
		{
			converterMap.put(clazz, converter);
		}
	}
