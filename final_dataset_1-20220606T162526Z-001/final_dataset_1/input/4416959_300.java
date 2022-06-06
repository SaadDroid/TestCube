public URL getResource(String path)
    {
        try
        {
            return servletContext.getResource(path);
        }
        catch (MalformedURLException ex)
        {
            throw new RuntimeException(ex);
        }
    }
