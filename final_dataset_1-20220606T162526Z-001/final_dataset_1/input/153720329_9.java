@Override
    public void recover(SourceKey tableKey) {
        recover(getUnstoredSegmentKeys(tableKey));
    }
