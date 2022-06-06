@PublicAPI(usage = ACCESS)
    public static SliceIdentifier of(String... parts) {
        return of(ImmutableList.copyOf(parts));
    }
