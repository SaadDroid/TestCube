public static Synchronizer forEventSource(final EventSource<?> src, final Runnable r) {
    return new RegistrationSynchronizer() {
      @Override
      protected Registration doAttach(SynchronizerContext ctx) {
        r.run();
        return src.addHandler(new EventHandler<Object>() {
          @Override
          public void onEvent(Object event) {
            r.run();
          }
        });
      }
    };
  }
