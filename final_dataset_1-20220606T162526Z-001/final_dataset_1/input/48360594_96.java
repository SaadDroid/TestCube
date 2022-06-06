public int getMaxDoc() {
        try {
            final IndexSearcher searcher = mgr.acquire();
            final int numDocs = searcher.getIndexReader().maxDoc();
            mgr.release(searcher);
            return numDocs;
        } catch (IOException e) {
            LOGGER.error(e.getMessage(), e);
        }
        return -1;
    }
