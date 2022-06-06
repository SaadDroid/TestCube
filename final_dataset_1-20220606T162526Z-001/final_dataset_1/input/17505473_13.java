@SuppressWarnings("unchecked")
    public List<MetricsResource> getMetricsResources(Map<String, Object> report) {
        List<MetricsResource> metricsResources = new ArrayList<MetricsResource>();

        if (report == null) {
            return metricsResources;
        }

        Map<String, Object> metrics = (Map<String, Object>) report.get("metrics");
        if (metrics == null) {
            return metricsResources;
        }

        Map<String, Object> resources = (Map<String, Object>) metrics.get("resources");
        if (resources == null) {
            return metricsResources;
        }

        List<List<Object>> values = (List<List<Object>>) resources.get("values");
        if (values == null) {
            return metricsResources;
        }

        for (List<Object> value : values) {
            String name = value.get(1).toString();
            int count = Integer.parseInt(value.get(2).toString());

            MetricsResource metricsResource = new MetricsResource();
            metricsResource.setName(name);
            metricsResource.setCount(count);
            metricsResources.add(metricsResource);
        }

        return metricsResources;
    }
