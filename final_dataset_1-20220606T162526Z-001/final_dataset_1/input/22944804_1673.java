public static long copyStream(InputStream in, OutputStream out) throws IOException {
        Reject.ifNull(in, out);
        final byte[] buffer = new byte[BUFFER_SIZE];
        long bytesCopied = 0L;

        for (int bytesRead = in.read(buffer); bytesRead != -1; bytesRead = in.read(buffer)) {
            out.write(buffer, 0, bytesRead);
            bytesCopied += bytesRead;
        }

        return bytesCopied;
    }
