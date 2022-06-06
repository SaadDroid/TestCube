@Override
  public boolean evaluate(AdaptrisMessage message) throws CoreException {
    boolean returnValue = false;
    for(Condition condition : this.getConditions()) {
      if(condition.evaluate(message)) {
        returnValue = true;
        break;
      }
    }
    return returnValue;
  }
