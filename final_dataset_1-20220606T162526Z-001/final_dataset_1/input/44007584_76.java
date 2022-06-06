public static String generateMethodArgsClassName( String serviceName, String methodName ) {

        int index = serviceName.lastIndexOf( "." );

        if ( index > 0 ) {

            return new StringBuilder( 32 )
                    .append( serviceName.substring( 0, index + 1 ) )
                    .append( "$__" )
                    .append( serviceName.substring( index + 1 ) )
                    .append( "Stub$" )
                    .append( methodName )
                    .append( "_args" )
                    .toString();

        } else {
            return new StringBuffer( 32 )
                    .append( "$__" )
                    .append( serviceName )
                    .append( "Stub$" )
                    .append( methodName )
                    .append( "_args" )
                    .toString();
        }

    }
