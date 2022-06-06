protected static String removePatternsFromPlaceholders(String path)
    {
        if(null == path)
        {
            return null;
        }
        StringBuilder result = new StringBuilder();
        String [] segments = path.split("/");
        for(int i=0; i<segments.length; i++)
        {
            String seg = segments[i];
            result.append(seg.replaceAll("^(\\$\\{[^:]+):.+\\}$", "$1}"));
            if(i < segments.length-1 || path.endsWith("/"))
            {
                result.append("/");
            }
        }
        return result.toString();
    }
