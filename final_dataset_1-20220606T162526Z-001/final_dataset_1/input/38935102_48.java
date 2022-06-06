@Nonnull
  MindMap makeFromLines(@Nonnull @MustNotContainNull final List<String> lines) {
    final MindMap result = new MindMap(false);
    final Iterator<String> iterator = lines.iterator();
    final List<TopicData> topicStack = new ArrayList<TopicData>();
    while (true) {
      final Topic topic = decodeLine(result, iterator, topicStack);
      if (topic == null) {
        break;
      }
    }

    final Topic root = result.getRoot();

    final int size = root == null ? 0 : root.getChildren().size();
    if (root != null && size != 0) {
      final List<Topic> topics = root.getChildren();
      final int left = (topics.size() + 1) / 2;
      for (int i = 0; i < left; i++) {
        AbstractCollapsableElement.makeTopicLeftSided(topics.get(i), true);
      }
    }

    return result;
  }
