@Override
    public synchronized Snapshot record(long duration, TimeUnit durationUnit, Outcome outcome) {
        totalAggregation.record(duration, durationUnit, outcome);
        moveWindowByOne().record(duration, durationUnit, outcome);
        return new SnapshotImpl(totalAggregation);
    }
