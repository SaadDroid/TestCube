public String getName()
	{
		if( reference instanceof TypeNameRef )
			return ( (TypeNameRef)reference ).getName();

		if( reference instanceof ValueNameRef )
			return ( (ValueNameRef)reference ).getName();

		throw new IllegalStateException();
	}
