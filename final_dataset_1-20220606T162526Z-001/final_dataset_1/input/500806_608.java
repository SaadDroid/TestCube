@Override
    public Message receive(TestContext context, long timeout) {
        return messageQueue.createConsumer().receive(context, timeout);
    }
