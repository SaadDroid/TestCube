public void reset() {
        synchronized(this) {
            this.stubbings.clear();
            this.httpStubs.clear();
            this.receivedRequests.clear();
            this.configurable = true;
        }
    }
