void ping(PingerCallback pingerCallback) {
        PingTask pingTask = pingTaskFactory.create(endpoint, pingerCallback);
        pingTask.execute();
    }
