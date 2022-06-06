public ViewState getCrashNotFoundViewState() {
    return new ViewState.Builder().withVisible(crashViewModels.isEmpty()).build();
  }
