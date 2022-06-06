@SuppressFBWarnings(value = "PZLA_PREFER_ZERO_LENGTH_ARRAYS", justification = "Returning null means the input was null")
    @Override
    public byte[] apply(final byte[] compressed) {
        if (isNull(compressed)) {
            return null;
        }

        if (compressed.length == 0) {
            return new byte[0];
        }

        try (final GZIPInputStream gzipStream = new GZIPInputStream(new ByteArrayInputStream(compressed))) {
            return IOUtils.toByteArray(gzipStream);
        } catch (final IOException e) {
            throw new RuntimeException("Failed to decompress provided gzipped string", e);
        }
    }
