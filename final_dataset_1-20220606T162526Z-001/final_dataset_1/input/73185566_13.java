public SubscriptionToken start() {
        workerThread.start();
        return subscriptionWorker;
    }
