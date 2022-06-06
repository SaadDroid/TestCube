public URL getResource(String path) {
        String internalPath = substringAfter(path, "/" + getLabel());
        if (startsWith(internalPath, PREFIX_STATIC)) {
            return getClass().getResource("/META-INF/consoleplugin/modelregistry" + internalPath);
        }
        return null;
    }
