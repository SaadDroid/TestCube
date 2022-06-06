public static boolean isRealInterfaceName(@Nonnull String name) {
    return !ImmutableList.of(
            UNSET_LOCAL_INTERFACE,
            DYNAMIC_INTERFACE_NAME,
            NULL_INTERFACE_NAME,
            INVALID_LOCAL_INTERFACE)
        .contains(name);
  }
