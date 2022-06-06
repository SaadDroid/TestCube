public CollectFilter<?> getFilter( String aParams ) throws SdiException
    {
        if ( !StringUtils.hasText( aParams ) )
        {
            throw new SdiException( "Given param is empty!",
                                    SdiException.EXIT_CODE_CONFIG_ERROR );

        }

        String[] values = aParams.split( ":", 3 );

        if ( values.length < 2 )
        {
            throw new SdiException( "Given param does not contain at least 2 parts: " + aParams,
                                    SdiException.EXIT_CODE_CONFIG_ERROR );
        }

        String filterName = values[0];
        String fieldName = values[1];
        String params = values.length == 3 ? values[2] : null;

        myLog.debug( "Looking up filter " + filterName + " for field " + fieldName );

        Map<String, Object>  beans = myAppCtxt.getBeansWithAnnotation( SdiFilter.class );

        myLog.trace( "Found candidates for filters: " + beans.keySet() );

        for ( Object bean : beans.values() )
        {
            SdiFilter annotation = bean.getClass().getAnnotation( SdiFilter.class );
            String value = annotation.value();

            if ( filterName.equals( value ) )
            {
                if ( !( bean instanceof CollectFilter ) )
                {
                    throw new SdiException( "Found Bean annotated with @SdiFilter which is not a CollectFilter, but: "
                            + bean.getClass().getName(),
                            SdiException.EXIT_CODE_CONFIG_ERROR );
                }

                CollectFilter<?> filter = (CollectFilter<?>) bean;

                return filter.init( fieldName, params );
            }
        }

        throw new SdiException( "No filter found for filtername " + filterName,
                                SdiException.EXIT_CODE_CONFIG_ERROR );
    }
