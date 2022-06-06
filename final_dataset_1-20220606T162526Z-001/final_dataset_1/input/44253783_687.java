@Override
  public String getValueFromMessage(AdaptrisMessage msg) throws CoreException {
    NamespaceContext ctx = SimpleNamespaceContext.create(getNamespaceContext(), msg);
    DocumentBuilderFactoryBuilder builder = documentFactoryBuilder(ctx);
    String result = null;
    try {
      XPath xp = XPath.newXPathInstance(builder, ctx);
      Document d = XmlHelper.createDocument(msg, builder);
      result = xp.selectSingleTextItem(d, msg.resolve(getXpath()));
    }
    catch (Exception e) {
      throw ExceptionHelper.wrapCoreException(e);
    }
    return result;
  }
