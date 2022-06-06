@Override
  public boolean evaluate(AdaptrisMessage message) throws CoreException {
    if(this.getConditions().size() == 0)
      return false;
    
    boolean returnValue = true;
    for(Condition condition : this.getConditions()) {
      if(!condition.evaluate(message)) {
        returnValue = false;
        break;
      }
    }
    return returnValue;
  }
