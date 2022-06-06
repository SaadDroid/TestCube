public void close(Message message) throws IOException {
        if (message instanceof CorbaMessage) {
            buildRequestResult((CorbaMessage)message);
        }
        message.getContent(OutputStream.class).close();
    }
