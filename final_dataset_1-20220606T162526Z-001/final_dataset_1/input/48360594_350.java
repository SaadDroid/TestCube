@Override
    public void onDifferent(Record record1, Record record2, MatchResult matchResult) {
        RichRecord currentRecord = (RichRecord) record2;
        currentRecord.setMaster(true);
        // The rest of group properties will be set in RichRecord$getOutputRow()
    }
