public static Class<?> parseType(final QName type) {
        if (type == null) {
            return null;
        }
        
        final String localPart = type.getLocalPart();
        int indexOf = localPart.indexOf(':');
        if (indexOf != -1) {
            return Classes.forName(localPart.substring(indexOf + 1));
        } else {
            return null;
        }
    }
