boolean doSynchronousPing() {
        Logger.d("Pinging: " + endpoint);
        try {
            return validator.isResponseCodeValid(responseCodeFetcher.from(endpoint));
        } catch (RequestException e) {
            if (!e.causedByIO()) {
                Logger.e("Ping task failed due to " + e.getMessage());
            }
            return false;
        }
    }
