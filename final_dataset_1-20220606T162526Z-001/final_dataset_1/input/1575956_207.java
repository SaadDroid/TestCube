@Override
    public LedgerRangeIterator getLedgerRanges(long opTimeOutMs) {
        KeyStream<Long> ks = new KeyStream<>(
            kvClient,
            ByteSequence.fromString(EtcdUtils.getLedgerKey(scope, 0L)),
            ByteSequence.fromString(EtcdUtils.getLedgerKey(scope, Long.MAX_VALUE)),
            bs -> {
                UUID uuid = EtcdUtils.parseLedgerKey(bs.toStringUtf8());
                return uuid.getLeastSignificantBits();
            }
        );
        KeyIterator<Long> ki = new KeyIterator<>(ks);
        return new LedgerRangeIterator() {
            @Override
            public boolean hasNext() throws IOException {
                try {
                    return ki.hasNext();
                } catch (Exception e) {
                    if (e instanceof IOException) {
                        throw ((IOException) e);
                    } else {
                        throw new IOException(e);
                    }
                }
            }

            @Override
            public LedgerRange next() throws IOException {
                try {
                    final List<Long> values = ki.next();
                    final Set<Long> ledgers = Sets.newTreeSet();
                    ledgers.addAll(values);
                    return new LedgerRange(ledgers);
                } catch (Exception e) {
                    if (e instanceof IOException) {
                        throw ((IOException) e);
                    } else {
                        throw new IOException(e);
                    }
                }
            }
        };
    }
