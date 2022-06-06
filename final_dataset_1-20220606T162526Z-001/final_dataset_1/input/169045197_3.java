@Around("@within(io.fency.IdempotentConsumer)")
  public synchronized Object execute(ProceedingJoinPoint pjp) throws Throwable {
    Object proceed = null;
    MessageContext context = idempotentMessageContextService.get();

    Optional<Message> message = idempotentMessageService.find(context.getMessageId(), context.getConsumerQueueName());

    if (message.isPresent()) {
      logError(context);
    } else {
      log.debug(String
          .format("Message with id %s for consumer queue %s not found, processing it",
              context.getMessageId(), context.getConsumerQueueName()));

      proceed = pjp.proceed();

      Message newMessage = new Message(context);
      idempotentMessageService.save(newMessage);
    }

    return proceed;
  }
