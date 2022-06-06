@Override
    public void postProcess(final Path sourcePath,
                            final Path destinationPath) {

        String dataObjectSource = ioService.readAllString(Paths.convert(destinationPath));
        GenerationResult generationResult = dataModelerService.loadDataObject(destinationPath,
                                                                              dataObjectSource,
                                                                              destinationPath);
        org.uberfire.java.nio.file.Path source = Paths.convert(kieModuleService.resolvePackage(sourcePath).getPackageMainResourcesPath());
        org.uberfire.java.nio.file.Path sourcePackage = Files.isDirectory(source) ? source : source.getParent();

        String sourceSolutionFileName = sourcePath.getFileName().substring(0,
                                                                           sourcePath.getFileName().indexOf("."));
        org.uberfire.java.nio.file.Path sourceScoreHolderGlobalPath = sourcePackage.resolve(sourceSolutionFileName + SCORE_HOLDER_GLOBAL_FILE_SUFFIX);

        if (generationResult.hasErrors()) {
            LOGGER.warn("Path " + destinationPath + " parsing as a data object has failed. Score holder global generation will be skipped.");
        } else {
            DataObject dataObject = generationResult.getDataObject();
            if (dataObject != null && dataObject.getAnnotation(PLANNING_SOLUTION_ANNOTATION) != null) {
                String sourceScoreTypeFqn = scoreHolderUtils.extractScoreTypeFqn(dataObject);
                String scoreHolderTypeFqn = scoreHolderUtils.getScoreHolderTypeFqn(sourceScoreTypeFqn);

                if (scoreHolderTypeFqn == null) {
                    LOGGER.warn("'scoreHolder' global variable will not be generated, as the selected score type is not supported");
                    return;
                }

                if (sourcePath.equals(destinationPath)) {
                    boolean scoreHolderGlobalFileExists = ioService.exists(sourceScoreHolderGlobalPath);

                    if (scoreHolderGlobalFileExists) {
                        GlobalsModel globalsModel = globalsEditorService.load(Paths.convert(sourceScoreHolderGlobalPath));
                        globalsModel.setGlobals(Arrays.asList(new Global(SCORE_HOLDER,
                                                                         scoreHolderTypeFqn)));
                        globalsEditorService.save(Paths.convert(sourceScoreHolderGlobalPath),
                                                  globalsModel,
                                                  metadataService.getMetadata(Paths.convert(sourceScoreHolderGlobalPath)),
                                                  "Auto generate scoreHolder global");
                    } else {
                        createScoreHolderGlobalFile(Paths.convert(sourcePackage),
                                                    scoreHolderTypeFqn,
                                                    sourceSolutionFileName);
                    }
                } else {
                    org.uberfire.java.nio.file.Path destination = Paths.convert(kieModuleService.resolvePackage(destinationPath).getPackageMainResourcesPath());
                    org.uberfire.java.nio.file.Path destinationPackage = Files.isDirectory(destination) ? destination : destination.getParent();

                    ioService.deleteIfExists(sourceScoreHolderGlobalPath);

                    String destinationScoreHolderFileSimpleName = destinationPath.getFileName().substring(0,
                                                                                                          destinationPath.getFileName().indexOf("."));
                    createScoreHolderGlobalFile(Paths.convert(destinationPackage),
                                                scoreHolderTypeFqn,
                                                destinationScoreHolderFileSimpleName);
                }
            } else {
                ioService.deleteIfExists(sourceScoreHolderGlobalPath);
            }
        }
    }
