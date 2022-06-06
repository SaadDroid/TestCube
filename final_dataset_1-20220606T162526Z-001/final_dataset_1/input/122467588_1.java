public void getUserName() {
    disposable =
        nameRepository
            .getName()
            .timeout(2, TimeUnit.SECONDS)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                name -> {
                  listener.onUserNameLoaded(name);
                  if (BuildConfig.DEBUG) {
                    logger.info(String.format("Name loaded: %s", name));
                  }
                },
                error -> listener.onGettingUserNameError(error.getMessage()));
  }
