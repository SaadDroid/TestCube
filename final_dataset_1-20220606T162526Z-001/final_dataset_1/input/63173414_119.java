@Override public void validate(Object candidate, Metadata<Rx2Retrofit> metadata) throws AssertionError {
    checkReturnMethodTypeIsSingleOrCompletable(metadata);

    if (candidate instanceof Completable) {
      Completable completable = (Completable) candidate;
      TestObserver testObserver = completable.test();
      testObserver.awaitTerminalEvent();
      testObserver.assertNoErrors();
      testObserver.assertComplete();
      return;
    }

    Single single = (Single) candidate;

    TestObserver testObserver = single.test();
    testObserver.awaitTerminalEvent();
    testObserver.assertNoErrors();
    testObserver.assertValueCount(1);

    Object enclosingObject = testObserver.values().get(0);

    if (enclosingObject instanceof Response) {
      Response response = (Response) enclosingObject;
      if (!response.isSuccessful()) throw new AssertionError("Response must be successful");
      if (response.body() == null) throw new AssertionError("Body must be not null");
      if (response.errorBody() != null) throw new AssertionError("Error body must be null");
    }
  }
