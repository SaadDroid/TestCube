public static InputStream toInputStream(final String str, final Charset charset) {
        return new ByteArrayInputStream(str.getBytes(charset));
    }
