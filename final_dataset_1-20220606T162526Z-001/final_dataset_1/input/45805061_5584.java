public void view(Closure<?> body) {
    body.setDelegate(_viewDelegate);
    body.call();
  }
