@Override
    public void setParams(List<String> params) {
        if (null != params) {
            if (params.size() < 5) {
                LOGGER.warning("Parameters list does not contain required length; you provided " + params.size() + ", expecting: 5 or more");
                throw new IllegalArgumentException();
            }
            nestedAggKey = params.get(NESTED_KEY_INDEX);
            metricKey = params.get(METRIC_KEY_INDEX);
            valueKey = params.get(VALUE_KEY_INDEX);
            switch (params.get(SELECTION_STRATEGY_INDEX)) {
            case SELECT_SMALLEST: 
                selectionStrategy = params.get(SELECTION_STRATEGY_INDEX);
                break;
            case SELECT_LARGEST: 
                selectionStrategy = params.get(SELECTION_STRATEGY_INDEX);
                break;
            default:
                LOGGER.warning("Unexpected buckets selection strategy parameter; you provided " + params.get(SELECTION_STRATEGY_INDEX) + ", defaulting to: " + selectionStrategy);
            }
            switch (params.get(RASTER_STRATEGY_INDEX)) {
            case RASTER_FROM_VALUE: 
                rasterStrategy = params.get(RASTER_STRATEGY_INDEX);
                break;
            case RASTER_FROM_KEY: 
                rasterStrategy = params.get(RASTER_STRATEGY_INDEX);
                break;
            default:
                LOGGER.warning("Unexpected raster strategy parameter; you provided " + params.get(RASTER_STRATEGY_INDEX) + ", defaulting to: " + rasterStrategy);
            }
            if (rasterStrategy.equals(RASTER_FROM_KEY) && params.size() >= 6) {
                termsMap = new HashMap<>();
                String[] terms = params.get(TERMS_MAP_INDEX).split(";");
                for (String term : terms) {
                    String[] keyValueSplit = term.split(":");
                    if (keyValueSplit.length != 2) {
                        LOGGER.warning("Term " + term + " does not contain required format <key>:<value>");
                        throw new IllegalArgumentException();
                    }
                    termsMap.put(keyValueSplit[0], new Integer(keyValueSplit[1]));
                }
            }
        }
    }
