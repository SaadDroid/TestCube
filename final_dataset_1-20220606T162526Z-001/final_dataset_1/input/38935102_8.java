@Nullable
  public Topic findPrev(@Nullable final File baseFolder, @Nullable final Topic start, @Nonnull final Pattern pattern, final boolean findInTopicText, @Nullable final Set<Extra.ExtraType> extrasForSearch) {
    if (start != null && start.getMap() != this) {
      throw new IllegalArgumentException("Topic doesn't belong to the mind map");
    }

    Topic result = null;

    this.locker.lock();
    try {
      final List<Topic> plain = this.makePlainList();
      int startIndex = start == null ? plain.size() : plain.indexOf(start);
      if (startIndex < 0) {
        throw new IllegalArgumentException("It looks like that topic doesn't belong to the mind map");
      }
      if (startIndex > 0) {
        while (startIndex > 0) {
          final Topic candidate = plain.get(--startIndex);
          if (candidate.containsPattern(baseFolder, pattern, findInTopicText, extrasForSearch)) {
            result = candidate;
            break;
          }
        }
      }
    } finally {
      this.locker.unlock();
    }

    return result;
  }
