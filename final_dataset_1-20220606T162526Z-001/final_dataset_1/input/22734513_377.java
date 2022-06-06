@Override
  @SuppressWarnings( "unchecked" )
  public <InputType, OutputType> OutputType getMapping( Class<InputType> inputType, InputType input,
                                                        Class<OutputType> outputType ) throws MappingException {
    AuthenticationMappingService<InputType, OutputType> service;
    synchronized ( serviceMap ) {
      service = serviceMap.get( new TypePair( inputType, outputType ) ).stream()
        .filter( ( rankedService ) -> rankedService.getService().accepts( input ) )
        .findFirst()
        .map( RankedAuthService::getService )
        .orElse( null );
    }

    return service != null ? service.getMapping( input, null ) : null;
  }
