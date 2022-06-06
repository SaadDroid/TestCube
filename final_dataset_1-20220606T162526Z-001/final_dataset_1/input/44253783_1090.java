@Override
  public SerializableMessage process(SerializableMessage msgToProcess) throws InterlokException {
    DefaultSerializableMessageTranslator translator = new DefaultSerializableMessageTranslator();
    AdaptrisMessage msg = toAdaptrisMessage(msgToProcess, translator);
    if (injectInterceptor == null) {
      // only create the interceptor if we need it.
      this.testAndInjectCachingInterceptor();
    }
    managedWorkflow.onAdaptrisMessage(msg);
    return translator.translate(this.waitForInjectReply(msg));
  }
