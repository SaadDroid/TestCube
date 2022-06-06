@Override
    public void visitFile(FileVisitDetails fileDetails) {
        if (isValidSourceFileForTask(fileDetails)) {
            compiler.compile(computeInputDirectory(fileDetails), fileDetails.getRelativePath());
        } else {
            compiler.getLogger().debug("Skipping file {} as it is not supported by program {}", fileDetails.getFile().getAbsolutePath(), compiler.getProgramName());
        }
    }
