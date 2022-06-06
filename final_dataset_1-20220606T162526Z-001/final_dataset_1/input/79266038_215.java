@Override
    public double readDouble(NativeProcess process, int offset) {
        return rawMemoryReader.read(process, offset, TypeSize.DOUBLE.getSize()).getDouble();
    }
