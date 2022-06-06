public Properties read( File file )
    {
        synchronized ( getLock( file ) )
        {
            FileLock lock = null;
            FileInputStream stream = null;
            try
            {
                if ( !file.exists() )
                {
                    return null;
                }

                stream = new FileInputStream( file );

                lock = lock( stream.getChannel(), Math.max( 1, file.length() ), true );

                Properties props = new Properties();
                props.load( stream );

                return props;
            }
            catch ( IOException e )
            {
                logger.warn( "Failed to read resolution tracking file " + file, e );
            }
            finally
            {
                release( lock, file );
                close( stream, file );
            }
        }

        return null;
    }
