public UpdateResponse deleteAllAndCommit() {
        try {
            return new UpdateRequest().deleteByQuery("*:*").commit(solrClient, nameOrAlias);
        } catch (IOException e) {
            logException(e);
            throw new UncheckedIOException(e);
        } catch (SolrServerException e) {
            logException(e);
            throw new UncheckedIOException(new IOException(e));
        }
    }
