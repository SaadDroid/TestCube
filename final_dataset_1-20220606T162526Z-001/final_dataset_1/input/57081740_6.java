public static byte[] generateMetadataXML(byte[] pdfBytes, String fileName, String url) throws IOException {
        return generateMetadataXML(pdfBytes, fileName, url, DEFAULT_GEOMETRY_SERVICE);
    }
