@Override
  public void onBlockProductionDue(final UInt64 slot) {
    notifyDutyQueue(DutyQueue::onBlockProductionDue, slot);
  }
