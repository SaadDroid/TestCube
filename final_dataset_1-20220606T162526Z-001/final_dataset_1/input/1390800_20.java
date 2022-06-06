public Spec getSpecFromFile(File specFile, SpecsValidator specsValidator) throws IOException {
        return getSpecFromString(FileUtils.readFileToString(specFile), specsValidator);
    }
