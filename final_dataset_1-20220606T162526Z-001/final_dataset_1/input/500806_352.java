public static String replacePropertiesInString(String line, Resource propertyResource) {
        Properties properties = new Properties();
        try {
            properties.load(propertyResource.getInputStream());
        } catch (IOException e) {
            return line;
        }

        return replacePropertiesInString(line, properties);
    }
