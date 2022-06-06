@Override
    public void evaluateVerification(final Collection<Matcher<? super Request>> requestPredicates,
            final Matcher<Integer> nrRequestsPredicate) {
        
        Validate.notNull(requestPredicates, "requestPredicates cannot be null");
        Validate.notNull(nrRequestsPredicate, "nrRequestsPredicate cannot be null");
        
        this.checkRequestRecording();
        
        synchronized(this) {
            final int cnt = this.numberOfRequestsMatching(requestPredicates);
        
            if (!nrRequestsPredicate.matches(cnt)) {
                this.logReceivedRequests(requestPredicates);
                throw new VerificationException(this.mismatchDescription(cnt, requestPredicates, nrRequestsPredicate));
            }
        }
    }
