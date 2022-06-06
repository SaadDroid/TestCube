public static NodeDecorator compose(NodeDecorator... decorators) {
    ArgumentChecker.noNulls(decorators, "decorators");
    switch (decorators.length) {
      case 0:
        return NodeDecorator.IDENTITY;
      case 1:
        return decorators[0];
      default:
        return new CompositeNodeDecorator(ImmutableList.copyOf(decorators));
    }
  }
