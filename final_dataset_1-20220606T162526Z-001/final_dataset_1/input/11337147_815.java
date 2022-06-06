@Override
    protected void fillCounters(final ProcessItem item, final List<String> counters) {
        fillNumberOfFailedCasesIfFailedCounterExists(item, counters);
        fillNumberOfOpenCasesIfOpenCounterExists(item, counters);
    }
