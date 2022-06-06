public static ClusterFilter forService(Class<? extends Service> type) {
        ArgAssert.notNull(type, "Service type");

        return forFilter(n -> n.hasService(type));
    }
