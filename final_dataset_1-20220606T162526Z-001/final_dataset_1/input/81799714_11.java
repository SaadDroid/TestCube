static Map<String, Object> getPathInfoOnlyParameterMap(String path, Predicate<String> pred) {
        String path1 = Optional.ofNullable(path).orElse("");
        Map<String, List<String>> allParams = Arrays.stream(path1.split("/"))
                .filter(segment -> segment.startsWith("~") && segment.contains("="))
                .map(kv -> kv.substring(1).split("="))
                .collect(groupingBy(kv -> kv[0], mapping(kv -> kv[1], toList())));

        // Filter and canonicalize the parameter map.
        Function<List<String>, Object> canonicalize = val -> (val.size() == 1) ? val.get(0) : val;
        return allParams.entrySet().stream()
                .filter(pair -> pred.test(pair.getKey()))
                .collect(collectingAndThen(toMap(Map.Entry::getKey, canonicalize.compose(Map.Entry::getValue)),
                        UtilHttp::canonicalizeParameterMap));
    }
