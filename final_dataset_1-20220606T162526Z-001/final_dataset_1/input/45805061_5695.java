public static ServiceContext of(Map<Class<?>, Object> services) {
    ArgumentChecker.noNulls(services, "services");
    return new ServiceContext(ImmutableClassToInstanceMap.copyOf(services));
  }
