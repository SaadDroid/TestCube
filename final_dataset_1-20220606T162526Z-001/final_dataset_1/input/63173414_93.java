@Override public Object adaptResponse(Object response, Metadata<Retrofit> metadata) {
    checkReturnMethodTypeIsCall(metadata);
    Call call = (Call) response;
    try {
      Response payload = call.clone().execute();
      Object body = payload.body();
      return body;
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
