public void send(String body) {
        if (isStopped) {
            throw new IllegalStateException(String.format(
                    "Producer %s was stopped and fail to deliver requested message [%s].", body, name));
        }
        Message msg = new SimpleMessage();
        msg.addHeader(Headers.DATE, new Date().toString());
        msg.addHeader(Headers.SENDER, name);
        msg.setBody(body);

        try {
            queue.put(msg);
        } catch (InterruptedException e) {
            // allow thread to exit
            LOGGER.error("Exception caught.", e);
        }
    }
