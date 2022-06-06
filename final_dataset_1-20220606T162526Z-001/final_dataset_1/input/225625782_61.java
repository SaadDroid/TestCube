@Override
  public void invoke(Context context, Object input) {
    InternalContext castedContext = (InternalContext) context;
    if (!(input instanceof AsyncOperationResult)) {
      onRequest(castedContext, (Any) input);
      return;
    }
    @SuppressWarnings("unchecked")
    AsyncOperationResult<ToFunction, FromFunction> result =
        (AsyncOperationResult<ToFunction, FromFunction>) input;
    onAsyncResult(castedContext, result);
  }
