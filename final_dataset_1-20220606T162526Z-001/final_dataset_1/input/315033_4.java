protected OpState getActualStateAfterTransition(OpState oldOpState, OpState currentOpState) {
    if (oldOpState == null) {
      if (currentOpState == null) {
        return null;
      }
      else {
        switch (currentOpState) {
          case UPDATE:
          case DELETE:
            throw new IllegalStateException("Can not update/delete a bean that does not exist");
          case SAVE:
            return OpState.SAVE;
        }
      }
    }
    else {
      if (currentOpState == null) {
        throw new IllegalStateException("Can not update/delete a bean that does not exist");
      }
      else {
        switch (oldOpState) {
          case SAVE: {
            switch (currentOpState) {
              case SAVE:
                throw new IllegalStateException(
                    "Constraint violation exception, a object with same id has already been saved");
              case DELETE:
                return null;
              case UPDATE:
              default:
                return oldOpState;
            }
          }
          case UPDATE: {
            switch (currentOpState) {
              case SAVE:
                throw new IllegalStateException("Can not save an existing bean");
              case DELETE:
                return currentOpState;
              case UPDATE:
              default:
                return oldOpState;
            }
          }
          case DELETE: {
            switch (currentOpState) {
              case SAVE:
                return OpState.UPDATE;
              case UPDATE:
              case DELETE:
              default:
                throw new IllegalStateException(
                    "Can not update/delete a bean that has been deleted earlier in the transaction");
            }
          }
        }
      }
    }
    return currentOpState;
  }
