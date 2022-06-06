public <T> RpcInterfaceInfo<T> analyzeType(Class<T> type) {
        @SuppressWarnings("unchecked")
        RpcInterfaceInfo<T> info = (RpcInterfaceInfo<T>)cached(type).stream()
            .filter(t -> t.javaType() == type)
            .findFirst()
            .orElseThrow(() ->
                new IllegalArgumentException(type.getName() + " must be a public interface "
                    + "and must be annotated with @" + Rpc.class.getSimpleName() + '.')
            );

        return info;
    }
