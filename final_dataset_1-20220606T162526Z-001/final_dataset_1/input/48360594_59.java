@Override
    public boolean analyze(String... record) {
        if (record == null) {
            return true;
        }
        textStatistics.resize(record.length);
        for (int i = 0; i < record.length; i++) {
            TextLengthStatistics freqStats = textStatistics.get(i);
            freqStats.add(record[i]);
        }
        return true;
    }
