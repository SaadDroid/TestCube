@Override
    public StringBuilder exportMetricsByName(MetricRegistry.Type scope, String name) {
        alreadyExportedNames.set(new HashSet<>());
        MetricRegistry registry = MetricRegistries.get(scope);
        Map<MetricID, Metric> metricsToExport = registry.getMetrics()
                .entrySet()
                .stream()
                .filter(entry -> entry.getKey().getName().equals(name))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        StringBuilder sb = new StringBuilder();
        exposeEntries(scope, sb, registry, metricsToExport);
        alreadyExportedNames.set(null);
        return sb;
    }
