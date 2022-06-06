@Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        if (intent == null) { // restarted
            stopSelf(startId);
            return START_STICKY;
        }
        CacheableWebView webView = new CacheableWebView(this);
        webView.setWebViewClient(new AdBlockWebViewClient(Preferences.adBlockEnabled(this)));
        webView.setWebChromeClient(new CacheableWebView.ArchiveClient() {
            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                super.onProgressChanged(view, newProgress);
                if (newProgress == 100) {
                    stopSelf(startId);
                }
            }
        });
        webView.loadUrl(intent.getStringExtra(EXTRA_URL));
        return START_STICKY;
    }
