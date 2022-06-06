public static String parsePackageName(String namespace, String defaultPackageName) {
        return (defaultPackageName != null && !defaultPackageName.trim().isEmpty())
            ? defaultPackageName : getPackageNameByNameSpaceURI(namespace.trim());
    }
