public File create(String path) {
        File file = new File(path);
        return validate(file);
    }
