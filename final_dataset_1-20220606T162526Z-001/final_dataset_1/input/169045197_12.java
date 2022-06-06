void set(MessageContext messageContext) {
    Assert.isNull(CONTEXT.get(),
        "The messageContext was not null before setting it! Clear should have been used!");
    CONTEXT.set(messageContext);
  }
