public static String getJType(String nameSpace, String type) {
        if (type == null || nameSpace == null || !nameSpaces.contains(nameSpace.toLowerCase())) {
            return null;
        }
        return jTypeMapping.get(type.toLowerCase());
    }
