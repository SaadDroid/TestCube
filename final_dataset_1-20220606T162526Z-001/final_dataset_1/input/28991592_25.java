@VisibleForTesting
    static String formatManganame( final String foldername ) {
        String mangarawname = foldername;
        if ( foldername.matches( ".+_\\d+" ) ) {
            int lastUnderscore = foldername.lastIndexOf( '_' );
            if ( lastUnderscore > -1 ) {
                mangarawname = foldername.substring( 0, lastUnderscore );
            }
        }
        return mangarawname.replace( '_', ' ' ).trim();
    }
