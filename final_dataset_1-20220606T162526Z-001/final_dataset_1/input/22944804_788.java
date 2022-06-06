@Override
    public Collection<String> nextPage() throws CoreTokenException {
        // Detect interruption.
        if (Thread.currentThread().isInterrupted()) {
            close();
            return null;
        }

        if (failed) {
            throw new IllegalStateException();
        }

        try {
            initConnection();
            Collection<String> results = impl.nextPage();
            endProcessing(results);
            return results;
        } catch (CoreTokenException e) {
            failed = true;
            close();
            throw e;
        }
    }
