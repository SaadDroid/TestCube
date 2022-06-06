public File getRealFile(String path)
    {
        String realPath = servletContext.getRealPath(path);

        return realPath == null ? null : new File(realPath);
    }
