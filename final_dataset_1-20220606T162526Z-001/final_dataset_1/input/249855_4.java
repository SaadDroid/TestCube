public List<BlobDetails> filter(final List<BlobDetails> objects) {

        if (objects == null) {
            return null;
        }

        List<BlobDetails> accepted = new ArrayList<BlobDetails>(objects);

        for (int i = 0; i < blobDetailsFilters.size() && !accepted.isEmpty(); i++) {
            accepted = blobDetailsFilters.get(0).filter(accepted);
        }

        return accepted;
    }
