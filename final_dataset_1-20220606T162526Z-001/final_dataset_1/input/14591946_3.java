@Override
  protected void executeMojo() throws MojoExecutionException {

    try {
      File mojosXml = new File(outputDirectory, PATH_MOJOS_XML);
      if (!mojosXml.isFile()) {
        // the project does not have any mojos, don't create empty plugin.xml
        return;
      }

      InputSet inputSet = context.newInputSet();

      final Set<File> classpathJars = new LinkedHashSet<>();
      final Set<File> classpathFiles = new LinkedHashSet<>();
      for (Artifact artifact : dependencies) {
        if (artifact.getFile().isFile()) {
          classpathJars.add(inputSet.addInput(artifact.getFile()));
        } else if (artifact.getFile().isDirectory()) {
          File file = new File(artifact.getFile(), PATH_MOJOS_XML);
          if (file.canRead()) {
            classpathFiles.add(inputSet.addInput(file));
          }
        }
      }
      inputSet.addInput(new File(outputDirectory, PATH_MOJOS_XML));

      if (eclipseMetadataFile.isFile()) {
        inputSet.addInput(eclipseMetadataFile);
      }

      // fail the build if m2e lifecycle mapping metadata is found among project <resources>
      // the metadata will be overwritten by #createEclipseMetadataXml, which almost certainly not what the user expects
      for (Resource resource : resources) {
        File otherEclipseMetadataFile = new File(resource.getDirectory(), PATH_METADATA_XML);
        if (otherEclipseMetadataFile.isFile()) {
          throw new MojoExecutionException(String.format("Unexpected Eclipse m2e metadata found %s. Did you mean to move it to %s", otherEclipseMetadataFile, eclipseMetadataFile));
        }
      }

      inputSet.aggregateIfNecessary(new File(outputDirectory, PATH_PLUGIN_XML), new InputAggregator() {
        @Override
        public void aggregate(Output<File> output, Iterable<File> inputs) throws IOException {
          createPluginXml(output, mojosXml, classpathFiles, classpathJars);
        }
      });
      inputSet.aggregateIfNecessary(new File(outputDirectory, PATH_METADATA_XML), new InputAggregator() {
        @Override
        public void aggregate(Output<File> output, Iterable<File> inputs) throws IOException {
          createEclipseMetadataXml(output, mojosXml, eclipseMetadataFile);
        }
      });

    } catch (IOException e) {
      throw new MojoExecutionException("Could not create plugin descriptor", e);
    }
  }
