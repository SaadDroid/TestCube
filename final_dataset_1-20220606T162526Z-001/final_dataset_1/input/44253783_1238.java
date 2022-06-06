public static ClosedState getInstance() {
    if (instance == null) {
      instance = new ClosedState();
    }

    return instance;
  }
