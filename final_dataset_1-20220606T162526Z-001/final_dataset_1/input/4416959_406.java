public static String toClassAttributeValue(List<String> classes)
    {
        if (classes.isEmpty())
            return null;

        return InternalUtils.join(classes, " ");
    }
