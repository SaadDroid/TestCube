@Override
  public boolean evaluate(AdaptrisMessage msg) throws ServiceException {
    try {
      Object o = ((Invocable) engine).invokeFunction("evaluateScript", msg);
      return BooleanUtils.toBoolean(o.toString());
    } catch (Exception e) {
      throw ExceptionHelper.wrapServiceException(e);
    }
  }
