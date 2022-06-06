public void handle(CloudRuntimeEvent<?, ?>... events) {
        if (events != null) {
            for (CloudRuntimeEvent<?, ?> event : events) {
                QueryEventHandler handler = handlers.get(event.getEventType().name());
                if (handler != null) {
                    LOGGER.debug("Handling event: " + handler.getHandledEvent());
                    handler.handle(event);
                } else {
                    LOGGER.info("No handler found for event: " + event.getEventType().name() + ". Ignoring event");
                }
            }
        }
    }
