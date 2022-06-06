public Collection<CompiledJavaccFile> listFiles() {
        Collection<File> files = FileUtils.listFiles(outputDirectory, TrueFileFilter.TRUE, TrueFileFilter.TRUE);
        Collection<CompiledJavaccFile> compiledJavaccFiles = new ArrayList<CompiledJavaccFile>();
        
        for (File file : files) {
            CompiledJavaccFile compiledJavaccFile = new CompiledJavaccFile(file, outputDirectory, customAstClassesDirectory, targetDirectory, logger);
            compiledJavaccFiles.add(compiledJavaccFile);
        }
        
        return compiledJavaccFiles;
    }
