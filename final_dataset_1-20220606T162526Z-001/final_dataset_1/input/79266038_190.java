@Override
    public int readInt(NativeProcess process, int offset) {
        return rawMemoryReader.read(process, offset, TypeSize.INT.getSize()).getInt();
    }
