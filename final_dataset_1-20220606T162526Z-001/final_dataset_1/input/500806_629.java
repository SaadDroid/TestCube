@Override
    public boolean accept(Message<?> message) {
        return matchingHeaders.entrySet()
                              .stream()
                              .allMatch(entry -> factories.stream()
                                                     .filter(factory -> factory.supports(entry.getKey()))
                                                     .findAny()
                                                     .orElse(new HeaderMatchingMessageSelector.Factory())
                                                     .create(entry.getKey(), entry.getValue(), context)
                                                     .accept(message));
    }
