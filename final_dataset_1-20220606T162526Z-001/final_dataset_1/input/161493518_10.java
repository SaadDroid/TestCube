@SuppressWarnings("java:S138")
  @Override
  public @NonNull RecordsConfig parse(final @Nullable RawRecordsConfig config) {
    Objects.requireNonNull(config);

    final Map<ValueType, RecordConfig> typeMap = new EnumMap<>(ValueType.class);
    final RecordConfig defaults =
        DEFAULTS_RECORD_CONFIG_PARSER.parse(config.defaults, RawRecordConfig::new);
    final ConfigParser<RawRecordConfig, RecordConfig> recordConfigParser =
        new RawRecordConfigParser(defaults);

    Optional.ofNullable(config.deployment)
        .map(recordConfigParser::parse)
        .ifPresent(c -> typeMap.put(ValueType.DEPLOYMENT, c));
    Optional.ofNullable(config.error)
        .map(recordConfigParser::parse)
        .ifPresent(c -> typeMap.put(ValueType.ERROR, c));
    Optional.ofNullable(config.incident)
        .map(recordConfigParser::parse)
        .ifPresent(c -> typeMap.put(ValueType.INCIDENT, c));
    Optional.ofNullable(config.job)
        .map(recordConfigParser::parse)
        .ifPresent(c -> typeMap.put(ValueType.JOB, c));
    Optional.ofNullable(config.jobBatch)
        .map(recordConfigParser::parse)
        .ifPresent(c -> typeMap.put(ValueType.JOB_BATCH, c));
    Optional.ofNullable(config.message)
        .map(recordConfigParser::parse)
        .ifPresent(c -> typeMap.put(ValueType.MESSAGE, c));
    Optional.ofNullable(config.messageSubscription)
        .map(recordConfigParser::parse)
        .ifPresent(c -> typeMap.put(ValueType.MESSAGE_SUBSCRIPTION, c));
    Optional.ofNullable(config.messageStartEventSubscription)
        .map(recordConfigParser::parse)
        .ifPresent(c -> typeMap.put(ValueType.MESSAGE_START_EVENT_SUBSCRIPTION, c));
    Optional.ofNullable(config.timer)
        .map(recordConfigParser::parse)
        .ifPresent(c -> typeMap.put(ValueType.TIMER, c));
    Optional.ofNullable(config.variable)
        .map(recordConfigParser::parse)
        .ifPresent(c -> typeMap.put(ValueType.VARIABLE, c));
    Optional.ofNullable(config.variableDocument)
        .map(recordConfigParser::parse)
        .ifPresent(c -> typeMap.put(ValueType.VARIABLE_DOCUMENT, c));
    Optional.ofNullable(config.workflowInstance)
        .map(recordConfigParser::parse)
        .ifPresent(c -> typeMap.put(ValueType.WORKFLOW_INSTANCE, c));
    Optional.ofNullable(config.workflowInstanceCreation)
        .map(recordConfigParser::parse)
        .ifPresent(c -> typeMap.put(ValueType.WORKFLOW_INSTANCE_CREATION, c));
    Optional.ofNullable(config.workflowInstanceResult)
        .map(recordConfigParser::parse)
        .ifPresent(c -> typeMap.put(ValueType.WORKFLOW_INSTANCE_RESULT, c));
    Optional.ofNullable(config.workflowInstanceSubscription)
        .map(recordConfigParser::parse)
        .ifPresent(c -> typeMap.put(ValueType.WORKFLOW_INSTANCE_SUBSCRIPTION, c));

    return new RecordsConfig(typeMap, defaults);
  }
