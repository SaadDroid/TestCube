public static String deleteXmlWhitespace(String string) {
        return XML_WHITESPACE.matcher(string).replaceAll("");
    }
