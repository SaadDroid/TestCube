@Override
    public float readFloat(NativeProcess process, int offset) {
        return rawMemoryReader.read(process, offset, TypeSize.FLOAT.getSize()).getFloat();
    }
