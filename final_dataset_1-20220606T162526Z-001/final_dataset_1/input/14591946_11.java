@Override
  protected void executeMojo() throws MojoExecutionException {

    if (!outputDirectory.exists()) {
      outputDirectory.mkdir();
    }

    if (mainJar) {
      File jar = new File(outputDirectory, String.format("%s.jar", finalName));
      InputSet registeredOutput = buildContext.newInputSet();
      try {
        if (classesDirectory.isDirectory()) {
          classesDirectory = classesDirectory.getCanonicalFile();
          Iterable<File> inputs = registeredOutput.addInputs(classesDirectory, null, null);
          logger.debug("Analyzing main classes directory {} with {} entries", classesDirectory, size(inputs));
        } else {
          logger.warn("Main classes directory {} does not exist", classesDirectory);
        }
        // XXX this does not detect changes in archive#manifestFile.
        boolean processingRequired = registeredOutput.aggregateIfNecessary(jar, new InputAggregator() {
          @Override
          public void aggregate(Output<File> output, Iterable<File> inputs) throws IOException {
            logger.info("Building main JAR.");

            List<Iterable<Entry>> sources = new ArrayList<>();
            if (archive != null && archive.getManifestFile() != null) {
              sources.add(jarManifestSource(archive.getManifestFile()));
            }
            sources.add(inputsSource(classesDirectory, inputs));
            sources.add(singleton(pomPropertiesSource(project)));
            sources.add(jarManifestSource(project));
            archive(output.getResource(), sources);
          }
        });
        if (!processingRequired) {
          logger.info("Main JAR is up-to-date");
        }

        if (!isJarProducingTakariLifecycle(project.getPackaging()) && alternateLifecycleProvidingPrimaryArtifact()) {
          // We have a non-Takari lifecycle and a property in the MavenSession has been explicity set to indicate the lifecycle
          // executing will produce the primary artifact.
          projectHelper.attachArtifact(project, "jar", jar);
          logger.info("The '{}' lifecycle has indicated it will produce the primary artifact. Attaching JAR as a secondary artifact.", project.getPackaging());
        } else {
          // We have a standard Takari lifecycle so set the JAR created here as the primary artifact.
          project.getArtifact().setFile(jar);
        }
      } catch (IOException e) {
        throw new MojoExecutionException(e.getMessage(), e);
      }
    }

    if (sourceJar) {
      final Multimap<File, File> sources = HashMultimap.create();
      File sourceJar = new File(outputDirectory, String.format("%s-%s.jar", finalName, "sources"));
      InputSet registeredOutput = buildContext.newInputSet();
      try {
        for (String sourceRoot : project.getCompileSourceRoots()) {
          File dir = new File(sourceRoot);
          if (dir.isDirectory()) {
            dir = dir.getCanonicalFile();
            Iterable<File> inputs = registeredOutput.addInputs(dir, null, null);
            logger.debug("Analyzing sources directory {} with {} entries", dir, size(inputs));
            sources.putAll(dir, inputs);
          } else {
            logger.debug("Sources directory {} does not exist", dir);
          }
        }
        boolean processingRequired = registeredOutput.aggregateIfNecessary(sourceJar, new InputAggregator() {
          @Override
          public void aggregate(Output<File> output, Iterable<File> inputs) throws IOException {
            logger.info("Building source JAR.");

            archive(output.getResource(), asList(inputsSource(sources), jarManifestSource(project)));
          }
        });
        if (!processingRequired) {
          logger.info("Source JAR is up-to-date");
        }
        projectHelper.attachArtifact(project, "jar", "sources", sourceJar);
      } catch (IOException e) {
        throw new MojoExecutionException(e.getMessage(), e);
      }
    }

    if (testJar && testClassesDirectory.isDirectory()) {
      File testJar = new File(outputDirectory, String.format("%s-%s.jar", finalName, "tests"));
      InputSet registeredOutput = buildContext.newInputSet();
      try {
        testClassesDirectory = testClassesDirectory.getCanonicalFile();
        Iterable<File> inputs = registeredOutput.addInputs(testClassesDirectory, null, null);
        logger.debug("Analyzing test classes directory {} with {} entries", testClassesDirectory, size(inputs));
        boolean processingRequired = registeredOutput.aggregateIfNecessary(testJar, new InputAggregator() {
          @Override
          public void aggregate(Output<File> output, Iterable<File> inputs) throws IOException {
            logger.info("Building test JAR.");

            archive(output.getResource(), asList(inputsSource(testClassesDirectory, inputs), jarManifestSource(project)));
          }
        });
        if (!processingRequired) {
          logger.info("Test JAR is up-to-date");
        }
      } catch (IOException e) {
        throw new MojoExecutionException(e.getMessage(), e);
      }
      projectHelper.attachArtifact(project, "jar", "tests", testJar);
    }
  }
