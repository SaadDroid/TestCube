@Override
  public Optional<ProgramState> constrainDependencies(ProgramState incomingState, Constraint constraint) {
    Optional<ProgramState> constrainedState = super.constrainDependencies(incomingState, constraint);
    constrainedState = constrainOperand(leftOperand, rightOperand, constraint, constrainedState.orElse(null));
    constrainedState = constrainOperand(rightOperand, leftOperand, constraint, constrainedState.orElse(null));
    return constrainedState;
  }
