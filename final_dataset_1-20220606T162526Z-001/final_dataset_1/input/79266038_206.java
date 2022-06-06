@Override
    public long readLong(NativeProcess process, int offset) {
        return rawMemoryReader.read(process, offset, TypeSize.LONG.getSize()).getLong();
    }
