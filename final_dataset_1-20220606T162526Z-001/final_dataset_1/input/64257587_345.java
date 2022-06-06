public void process(UserEvent userEvent) {
        logger.debug("Received userEvent: {}", userEvent);

        if (executor.isShutdown()) {
            logger.warn("Executor shutdown, not accepting tasks.");
            return;
        }

        if (!eventQueue.offer(userEvent)) {
            logger.warn("Payload not accepted by the queue. Current size: {}", eventQueue.size());
        }
    }
