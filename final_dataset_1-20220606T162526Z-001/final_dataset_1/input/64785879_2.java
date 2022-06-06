public void send(String text) throws JMSException {
    TextMessage message = session.createTextMessage(text);
    producer.send(message);

    LOGGER.info("{} sent with default priority(=4)", text);
  }
