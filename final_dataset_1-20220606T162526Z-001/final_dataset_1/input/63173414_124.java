@Override public Type adaptType(Type responseType, Metadata<Rx2Retrofit> metadata) {
    checkReturnMethodTypeIsSingleOrCompletable(metadata);

    if (!(responseType instanceof ParameterizedType)) return Object.class;

    ParameterizedType singleType = (ParameterizedType) responseType;

    if (isReturnMethodTypeResponse(metadata)) {
      ParameterizedType responseParameterizedType = (ParameterizedType)
          singleType.getActualTypeArguments()[0];
      Type enclosingType = responseParameterizedType.getActualTypeArguments()[0];
      return enclosingType;
    } else {
      Type enclosingType = singleType.getActualTypeArguments()[0];
      return enclosingType;
    }
  }
