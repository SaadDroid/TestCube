@Override
    public boolean readBoolean(NativeProcess process, int offset) {
        byte readByte =
            rawMemoryReader.read(process, offset, TypeSize.BOOLEAN.getSize()).get();
        return readByte != 0;
    }
