@Override
    public void processMessage(Message message, TestContext context) {
        message.setPayload(XMLUtils.prettyPrint(message.getPayload(String.class)));
    }
