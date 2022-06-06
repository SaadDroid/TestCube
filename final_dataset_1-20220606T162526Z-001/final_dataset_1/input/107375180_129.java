public static boolean isAccessible(Object pmo, String modelObjectName) {
        return getModelObjectAccessMember(pmo, modelObjectName).isPresent();
    }
