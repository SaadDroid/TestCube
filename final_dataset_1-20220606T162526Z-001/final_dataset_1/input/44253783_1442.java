@Override
  public void handleOutOfState(StateManagedComponent component) throws OutOfStateException {
    if(!this.isInCorrectState(component))
      throw new OutOfStateException("Expected state: " + this.getCorrectState().getClass().getSimpleName() + " but got " + component.retrieveComponentState().getClass().getSimpleName());
  }
