public LocalDistribution getDistribution( WrapperConfiguration configuration )
    {
        String baseName = getDistName( configuration.getDistribution() );
        String rootDirName = removeExtension( baseName );
        Path distDir = getBaseDir( configuration.getDistributionBase() )
                        .resolve( configuration.getDistributionPath() )
                        .resolve( rootDirName );
        Path distZip = getBaseDir( configuration.getZipBase() )
                        .resolve( configuration.getZipPath() )
                        .resolve( rootDirName )
                        .resolve( baseName );
        return new LocalDistribution( distDir, distZip );
    }
