@Override
    public <T> T build(Class<T> serviceInterface, T delegate, String serviceId)
    {
        assert serviceInterface != null;
        assert delegate != null;
        assert InternalUtils.isNonBlank(serviceId);
        String description = String.format("<Hibernate Transaction interceptor for %s(%s)>",
                                           serviceId,
                                           serviceInterface.getName());

        AspectInterceptorBuilder<T> builder = aspectDecorator.createBuilder(serviceInterface, delegate, description);

        advisor.addTransactionCommitAdvice(builder);

        return builder.build();
    }
