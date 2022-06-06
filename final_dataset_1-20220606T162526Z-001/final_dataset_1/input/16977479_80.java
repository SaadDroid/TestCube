public String getUsage() throws TransformerException, IOException {
        // REVISIT: style usage document into a form more readily output as a
        // usage message
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
            InputStream in = getClass().getResourceAsStream("usage.xsl")) {

            toolspec.transform(in, baos);
            return baos.toString();
        }
    }
