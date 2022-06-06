public static boolean isSecureReader(XMLStreamReader reader, Message message) {
        if (reader instanceof DocumentDepthProperties) {
            return true;
        }
        try {
            if (reader.getProperty(P_MAX_CHILDREN_PER_ELEMENT) != null) {
                return true;
            }
        } catch (Exception ex) {
            //ignore
        }
        return false;
    }
