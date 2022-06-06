@Override
    public JvmType jvmType() {
        return new JvmType("[" + componentType.jvmType().getSignature());
    }
