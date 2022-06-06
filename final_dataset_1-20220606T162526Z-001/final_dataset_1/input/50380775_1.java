boolean attachWebView(WebView webView, boolean screenshotsEnabled, boolean pullToRefreshEnabled) {
        if (webView.getParent() == refreshLayout) return false;

        refreshLayout.setEnabled(pullToRefreshEnabled);

        if (webView.getParent() instanceof TurbolinksSwipeRefreshLayout) {
            TurbolinksSwipeRefreshLayout previousRefreshLayout = (TurbolinksSwipeRefreshLayout) webView.getParent();
            TurbolinksView previousTurbolinksView = (TurbolinksView) previousRefreshLayout.getParent();

            if (screenshotsEnabled) previousTurbolinksView.screenshotView();

            try {
                // This is an admittedly hacky workaround, but it buys us some time as we investigate
                // a potential bug with Chrome 64, which is currently throwing an IllegalStateException
                // when accessibility services (like Talkback or 1password) are enabled.
                // We're tracking this bug on the Chromium issue tracker:
                // https://bugs.chromium.org/p/chromium/issues/detail?id=806108
                previousRefreshLayout.removeView(webView);
            } catch (Exception e) {
                previousRefreshLayout.removeView(webView);
            }
        }

        // Set the webview background to match the container background
        if (getBackground() instanceof ColorDrawable) {
            webView.setBackgroundColor(((ColorDrawable) getBackground()).getColor());
        }

        refreshLayout.addView(webView);
        return true;
    }
