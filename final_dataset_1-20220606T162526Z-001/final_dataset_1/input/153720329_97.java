@Override
    public void writeBytes(OutputStream output) {
        try {
            output.write(toBytes());
        } catch (IOException e) {
            SwiftLoggers.getLogger().error(e);
        } finally {
            IoUtil.close(output);
        }
    }
