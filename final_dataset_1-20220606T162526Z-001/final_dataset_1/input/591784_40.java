public long copy( File source, File target, ProgressListener listener )
        throws IOException
    {
        long total = 0;

        FileInputStream fis = null;
        OutputStream fos = null;
        try
        {
            fis = new FileInputStream( source );

            mkdirs( target.getParentFile() );

            fos = new BufferedOutputStream( new FileOutputStream( target ) );

            ByteBuffer buffer = ByteBuffer.allocate( 1024 * 32 );
            byte[] array = buffer.array();

            while ( true )
            {
                int bytes = fis.read( array );
                if ( bytes < 0 )
                {
                    break;
                }

                fos.write( array, 0, bytes );

                total += bytes;

                if ( listener != null && bytes > 0 )
                {
                    try
                    {
                        buffer.rewind();
                        buffer.limit( bytes );
                        listener.progressed( buffer );
                    }
                    catch ( Exception e )
                    {
                        // too bad
                    }
                }
            }
        }
        finally
        {
            close( fis );
            close( fos );
        }

        return total;
    }
