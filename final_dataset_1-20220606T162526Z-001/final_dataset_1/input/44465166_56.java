public Map<Integer, Integer> getLCSMatchMap(List<T> seq1, List<T> seq2) {
        List<T> mySeq1 = addDummyStart(seq1, null);
        List<T> mySeq2 = addDummyStart(seq2, null);

        double[][] table = getTable(mySeq1, mySeq2);

        return getBackTraceMap(table, mySeq1, mySeq2, mySeq1.size() - 1, mySeq2.size() - 1);
    }
