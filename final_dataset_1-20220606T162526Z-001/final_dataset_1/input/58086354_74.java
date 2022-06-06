public static <ReqT, RespT> ServerCallHandler<ReqT, RespT> asyncBidiStreamingCall(
      final BidiStreamingMethod<ReqT, RespT> method) {
    return asyncStreamingRequestCall(method);
  }
