@Override
    public DetailQueryResultSet getQueryResult() {
        return new SegmentDetailResultSet(fetchSize, columnList, filter);
    }
