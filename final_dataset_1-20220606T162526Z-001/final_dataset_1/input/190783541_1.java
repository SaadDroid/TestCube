public long getExponentialDelayMillis(int attemptsLeft, BackupFlags backupFlags) {
    int maxWaitingTimeBtwUpload = backupFlags.getMaxWaitingTimeBtwUpload();
    if (attemptsLeft < 1) {
      return backupFlags.getMinUploadDelay();
    }
    if (attemptsLeft > backupFlags.getAttemptsAmount()) {
      return maxWaitingTimeBtwUpload;
    }
    long delay = (long) (backupFlags.getMinUploadDelay() + (Math.round(Math.pow(DELAY_CALCULATION_BASE, backupFlags.getAttemptsAmount() - attemptsLeft + 1)) - DELAY_CALCULATION_BASE) * MILS_MUL);
    return (delay >= maxWaitingTimeBtwUpload) ? maxWaitingTimeBtwUpload : delay;
  }
