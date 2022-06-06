Stream<ReactomePropertyFile> getReactomePropertyFiles() {
        return getBioentityPropertyFiles(reactomeDirPath, PATTERN, ReactomePropertyFile::new);
    }
