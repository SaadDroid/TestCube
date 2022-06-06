public Transition toReturnFlowTransition(@Nullable Transformation transformation) {
    return transformation == null
        ? IDENTITY
        : reverse(toTransition(returnFlowTransformation(transformation)));
  }
