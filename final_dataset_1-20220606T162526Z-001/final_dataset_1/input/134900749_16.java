@Override
    public StringBuilder exportMetricsByName(MetricRegistry.Type scope, String name) {
        MetricRegistry registry = MetricRegistries.get(scope);
        Map<MetricID, Metric> metricMap = registry.getMetrics()
                .entrySet()
                .stream()
                .filter(e -> e.getKey().getName().equals(name))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue));
        Map<String, Metadata> metadataMap = registry.getMetadata();

        JsonObjectBuilder root = JsonProviderHolder.get().createObjectBuilder();
        exportMetricsForMap(metricMap, metadataMap)
                .forEach(root::add);
        return stringify(root.build());
    }
