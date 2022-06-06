@Override
    public void visitFile(FileVisitDetails fileDetails) {
        if (!isValidSourceFileForTask(fileDetails)) {
            File sourceFile = fileDetails.getFile();
            File destinationFile = new File(sourceFile.getAbsolutePath().replace(compiler.getInputDirectory().getAbsolutePath(), compiler.getOutputDirectory().getAbsolutePath()));

            copyFile(sourceFile, destinationFile);
        }
    }
