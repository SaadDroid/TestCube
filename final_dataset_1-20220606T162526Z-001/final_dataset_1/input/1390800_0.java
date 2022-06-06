public Boolean transform(File pomFile) throws IOException {
        this.pomFile = pomFile;
        if (!pomFile.exists()) {
            throw new IllegalArgumentException("Couldn't find pom file: " + pomFile);
        }

        SAXBuilder saxBuilder = createSaxBuilder();
        Document document;
        EolDetectingInputStream eolDetectingStream = null;
        InputStreamReader inputStreamReader = null;
        try {
            eolDetectingStream = new EolDetectingInputStream(new FileInputStream(pomFile));
            inputStreamReader = new InputStreamReader(eolDetectingStream, "UTF-8");
            document = saxBuilder.build(inputStreamReader);
        } catch (JDOMException e) {
            throw new IOException("Failed to parse pom: " + pomFile.getAbsolutePath(), e);
        } finally {
            IOUtils.closeQuietly(inputStreamReader);
            IOUtils.closeQuietly(eolDetectingStream);
        }

        Element rootElement = document.getRootElement();
        Namespace ns = rootElement.getNamespace();
        getProperties(rootElement, ns);
        changeParentVersion(rootElement, ns);

        changeCurrentModuleVersion(rootElement, ns);

        //changePropertiesVersion(rootElement, ns);

        changeDependencyManagementVersions(rootElement, ns);

        changeDependencyVersions(rootElement, ns);

        if (scmUrl != null) {
            changeScm(rootElement, ns);
        }

        if (modified && !dryRun) {
            FileOutputStream fileOutputStream = new FileOutputStream(pomFile);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "UTF-8");
            try {
                XMLOutputter outputter = new XMLOutputter();
                String eol = eolDetectingStream.getEol();
                if (!"".equals(eol)) {
                    Format format = outputter.getFormat();
                    format.setLineSeparator(eol);
                    format.setTextMode(Format.TextMode.PRESERVE);
                    outputter.setFormat(format);
                }
                outputter.output(document, outputStreamWriter);
            } finally {
                IOUtils.closeQuietly(outputStreamWriter);
                IOUtils.closeQuietly(fileOutputStream);
            }
        }

        return modified;
    }
