@Override
    public void scrollToTop() {
        if (mFullscreen) {
            mWebView.pageUp(true);
        } else {
            mScrollableHelper.scrollToTop();
        }
    }
