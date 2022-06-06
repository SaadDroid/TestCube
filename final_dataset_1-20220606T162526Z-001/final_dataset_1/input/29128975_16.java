@NonNull
    @CheckReturnValue
    public static Single<InputStream> getDataStream(@NonNull final ParseFile file) {
        return RxTask.single(() -> file.getDataStreamInBackground());
    }
