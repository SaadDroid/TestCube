public static String toId( Artifact artifact )
    {
        String id = null;
        if ( artifact != null )
        {
            id =
                toId( artifact.getGroupId(), artifact.getArtifactId(), artifact.getExtension(),
                      artifact.getClassifier(), artifact.getVersion() );
        }
        return id;
    }
