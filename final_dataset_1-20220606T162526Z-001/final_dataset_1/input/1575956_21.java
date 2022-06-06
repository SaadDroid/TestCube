public static MetadataBookieDriver getBookieDriver(String scheme) {
        checkNotNull(scheme, "Bookie Driver Scheme is null");
        MetadataBookieDriverInfo driverInfo = bookieDrivers.get(scheme.toLowerCase());
        if (null == driverInfo) {
            throw new IllegalArgumentException("Unknown backend " + scheme);
        }
        return ReflectionUtils.newInstance(driverInfo.driverClass);
    }
