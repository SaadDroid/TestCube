@Override
    public File getDatabasePath(String name) {

        final File dir = new File(super.getDatabasePath(name).getParentFile(),
                componentPath);
        dir.mkdirs();

        return new File(dir, name);
    }
