@Override
    public void authenticate(JsonObject authInfo, Handler<AsyncResult<User>> resultHandler) {
        authenticate(null, authInfo, resultHandler);
    }
