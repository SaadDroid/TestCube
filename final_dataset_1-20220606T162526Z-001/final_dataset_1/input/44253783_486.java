@Override
  public void doService(AdaptrisMessage msg) throws ServiceException {
    int loopCount = 0;
    try {
      do {
        getThen().getService().doService(msg);
        loopCount++;
        if (!continueLooping(loopCount, msg)) {
          break;
        }
        log.trace("Testing condition for 'DO-WHILE', with condition class {}",
            this.getCondition().getClass().getSimpleName());
      } while (getCondition().evaluate(msg));
      log.trace("Logical 'DO-WHILE' completed, exiting.");
    } catch (Exception e) {
      throw ExceptionHelper.wrapServiceException(e);
    }
  }
