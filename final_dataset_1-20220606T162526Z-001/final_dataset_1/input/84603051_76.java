public ScheduledFuture<?> repeatAtFixedRate(RepeatingRunnable command, long initialDelay, long period, TimeUnit unit) {
        return super.scheduleAtFixedRate(RepeatingTask.of(command), initialDelay, period, unit);
    }
