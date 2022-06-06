@Override
    protected void processMessage(Message message, TestContext context) {
        if (message.getPayload() == null || !StringUtils.hasText(message.getPayload(String.class))) {
            return;
        }

        JsonPathMessageProcessor delegateProcessor = new JsonPathMessageProcessor.Builder()
                .ignoreNotFound(true)
                .expressions(mappings.entrySet().stream()
                        .collect(Collectors.toMap(Map.Entry::getKey, (entry) -> (Object) entry.getValue())))
                .build();
        delegateProcessor.processMessage(message, context);
    }
