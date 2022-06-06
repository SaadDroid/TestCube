public static MetadataClientDriver getClientDriver(String scheme) {
        checkNotNull(scheme, "Client Driver Scheme is null");
        MetadataClientDriverInfo driverInfo = clientDrivers.get(scheme.toLowerCase());
        if (null == driverInfo) {
            throw new IllegalArgumentException("Unknown backend " + scheme);
        }
        return ReflectionUtils.newInstance(driverInfo.driverClass);
    }
