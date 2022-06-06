@Override
  public void enableSchedule(ScheduleId scheduleId) throws NotFoundException, ConflictException {
    checkStarted();
    try {
      execute((StoreTxRunnable<Void, Exception>) store -> {
        enableScheduleInternal(store, scheduleId);
        return null;
      }, Exception.class);
    } catch (NotFoundException | ConflictException e) {
      throw e;
    } catch (SchedulerException e) {
      // TODO: [CDAP-11574] temporarily catch the SchedulerException and throw RuntimeException.
      throw new RuntimeException("Exception occurs when enabling schedule " + scheduleId, e);
    } catch (Exception e) {
      throw Throwables.propagate(e);
    }
  }
