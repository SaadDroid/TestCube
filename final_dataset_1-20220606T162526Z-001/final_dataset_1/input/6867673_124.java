@Deprecated
    @Override
    public int numberOfRequestsMatching(final Collection<Matcher<? super Request>> predicates) {
        Validate.notNull(predicates, "predicates cannot be null");
        checkRequestRecording();

        final Matcher<Request> all = allOf(predicates);
        
        int cnt = 0;
        
        synchronized(this) {
            for (final Request req: this.receivedRequests) {
                if (all.matches(req)) {
                    cnt++;
                }
            }
        }
        
        return cnt;
    }
