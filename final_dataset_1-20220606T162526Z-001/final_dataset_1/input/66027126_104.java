@Override
    public <T> Iterator<Parameter<T>> parameters(final ParameterType<T> parameterType)
    {
        return new Mapped<>(
                element -> (Parameter<T>) element,
                new Filtered<>(new Seq<>(mParameters),
                        element -> parameterType.equals(element.type()))
        );
    }
