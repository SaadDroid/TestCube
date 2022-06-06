static boolean compareCompositeSubtypes(String requiredType, String userType,
                                            Message message) {
        return compareCompositeSubtypes(toMediaType(requiredType), toMediaType(userType), message);
    }
