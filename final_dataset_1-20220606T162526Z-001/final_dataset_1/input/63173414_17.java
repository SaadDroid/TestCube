@Override public Type adaptType(Type responseType, Metadata<RxRetrofit> metadata) {
    checkReturnMethodTypeIsObservable(metadata);

    ParameterizedType observableType = (ParameterizedType) responseType;

    if (isReturnMethodTypeResponse(metadata)) {
      ParameterizedType responseParameterizedType = (ParameterizedType)
          observableType.getActualTypeArguments()[0];
      Type enclosingType = responseParameterizedType.getActualTypeArguments()[0];
      return enclosingType;
    } else {
      Type enclosingType = observableType.getActualTypeArguments()[0];
      return enclosingType;
    }
  }
