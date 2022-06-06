public void printContextInformation(StringBuilder result) {
        String contextInformation = context.entrySet().stream()
                .filter(e -> Objects.nonNull(e.getValue()))
                .filter(e -> !e.getValue().isEmpty())
                .map(es -> es.getKey() + "=" + es.getValue())
                .collect(joining(";"));
        result.append(contextInformation);
        if (!contextInformation.isEmpty()) {
            result.append(",");
        }
    }
