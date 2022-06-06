static InstanceIdentifier<ServiceFunction> createSfIid(@Nonnull ServiceFunctionKey key) {
        return InstanceIdentifier.builder(Native.class)
                .child(ServiceChain.class)
                .child(ServiceFunction.class, key)
                .build();
    }
