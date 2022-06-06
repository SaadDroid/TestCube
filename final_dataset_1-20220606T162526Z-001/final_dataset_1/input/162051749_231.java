public OpenNlpPosTagger(File modelFile) {
        Validate.notNull(modelFile, "The model file must not be null.");
        this.tagger = loadModel(modelFile);
    }
