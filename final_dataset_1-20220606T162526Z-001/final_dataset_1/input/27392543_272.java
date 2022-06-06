@VisibleForTesting
  static Config addMetricReportingDynamicConfig(Config config, KafkaAvroSchemaRegistry registry) throws IOException {
    Properties properties = ConfigUtils.configToProperties(config);
    if (KafkaReporterUtils.isEventsEnabled(properties)) {
      Schema schema = KafkaReporterUtils.getGobblinTrackingEventSchema();
      String schemaId = registry.register(schema, KafkaReporterUtils.getEventsTopic(properties).get());
      LOGGER.info("Adding schemaId {} for GobblinTrackingEvent to the config", schemaId);
      config = config.withValue(ConfigurationKeys.METRICS_REPORTING_EVENTS_KAFKA_AVRO_SCHEMA_ID,
          ConfigValueFactory.fromAnyRef(schemaId));
    }

    if (KafkaReporterUtils.isMetricsEnabled(properties)) {
      Schema schema = KafkaReporterUtils.getMetricReportSchema();
      String schemaId = registry.register(schema, KafkaReporterUtils.getMetricsTopic(properties).get());
      LOGGER.info("Adding schemaId {} for MetricReport to the config", schemaId);
      config = config.withValue(ConfigurationKeys.METRICS_REPORTING_METRICS_KAFKA_AVRO_SCHEMA_ID,
          ConfigValueFactory.fromAnyRef(schemaId));
    }
    return config;
  }
