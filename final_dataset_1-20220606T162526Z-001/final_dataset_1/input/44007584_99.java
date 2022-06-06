public void subscribe(URL url, NotifyListener listener) {
        super.subscribe(url, listener);
        subscribed(url, listener);
    }
