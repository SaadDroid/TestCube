public void sendMessage(String message) throws JMSException  {
		logger.info("Sending message to queue/topic: " + queueOrTopic);
		logger.debug("Message: " + message);
		
		TextMessage testMessage = session.createTextMessage(message);
		messageProducer.send(testMessage, DeliveryMode.NON_PERSISTENT, Message.DEFAULT_PRIORITY, Message.DEFAULT_TIME_TO_LIVE);
	}
