@Override
	public Value resolve( Scope scope ) throws ResolutionException
	{
		Type type = scope.getTypeOrDie();

		while( type != null && !( type instanceof ClassType ) )
			type = type.hasSibling() ? type.getSibling() : null;

		if( type == null )
			throw new ResolutionException( "Unable to find ClassType" );

		Module module = scope.getModule();
		ModuleResolver resolver = module.getModuleResolver();
		assert resolver != null;
		ClassType classType = (ClassType)type;

		try
		{
			AbstractSyntaxParser parser = new AbstractSyntaxParser( module, classType );
			Map<String, Ref<?>> result = parser.parse( abstractSyntax );
			return new ObjectValue( result );
		} catch( AbstractSyntaxParserException e )
		{
			throw new ResolutionException( "Unable to unwrap abstract syntax: " + abstractSyntax, e );
		}
	}
