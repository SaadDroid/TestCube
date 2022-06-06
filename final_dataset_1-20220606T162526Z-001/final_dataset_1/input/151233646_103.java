@Nonnull
    public static InfluxDBClient create() {

        InfluxDBClientOptions options = InfluxDBClientOptions.builder()
                .loadProperties()
                .build();

        return create(options);
    }
