public RequestCreator networkPolicy(@NonNull NetworkPolicy policy,
      @NonNull NetworkPolicy... additional) {
    if (policy == null) {
      throw new IllegalArgumentException("Network policy cannot be null.");
    }
    this.networkPolicy |= policy.index;
    if (additional == null) {
      throw new IllegalArgumentException("Network policy cannot be null.");
    }
    if (additional.length > 0) {
      for (NetworkPolicy networkPolicy : additional) {
        if (networkPolicy == null) {
          throw new IllegalArgumentException("Network policy cannot be null.");
        }
        this.networkPolicy |= networkPolicy.index;
      }
    }
    return this;
  }
