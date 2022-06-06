@Override
    public void put(long pos, String val) {
        byteArrayWriter.put(pos, val.getBytes(StringWriter.CHARSET));
    }
