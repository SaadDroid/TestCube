public Boolean transform() throws IOException, InterruptedException {
        if (!propertiesFile.exists()) {
            throw new IllegalArgumentException("Couldn't find properties file: " + propertiesFile.getAbsolutePath());
        }
        Properties properties = new Properties();
        EolDetectingInputStream eolDetectingInputStream = null;
        try {
            eolDetectingInputStream = new EolDetectingInputStream(new FileInputStream(propertiesFile));
            properties.load(eolDetectingInputStream);
        } finally {
            IOUtils.closeQuietly(eolDetectingInputStream);
        }
        String eol = eolDetectingInputStream.getEol();
        boolean hasEol = !"".equals(eol);

        StringBuilder resultBuilder = new StringBuilder();
        boolean modified = false;
        Enumeration<?> propertyNames = properties.propertyNames();
        while (propertyNames.hasMoreElements()) {
            String propertyName = (String) propertyNames.nextElement();
            String propertyValue = properties.getProperty(propertyName);

            StringBuilder lineBuilder = new StringBuilder(propertyName).append("=");

            String newPropertyValue = versionsByName.get(propertyName);
            if ((newPropertyValue != null) && !newPropertyValue.equals(propertyValue)) {
                if (!modified) {
                    modified = true;
                }
                lineBuilder.append(newPropertyValue);
            } else {
                lineBuilder.append(propertyValue);
            }
            resultBuilder.append(lineBuilder.toString());
            if (hasEol) {
                resultBuilder.append(eol);
            }
        }

        if (modified) {
            propertiesFile.delete();
            String toWrite = resultBuilder.toString();
            Files.write(toWrite, propertiesFile, Charsets.UTF_8);
        }

        return modified;
    }
