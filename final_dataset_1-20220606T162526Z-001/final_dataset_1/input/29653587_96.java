@Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        mKeyDelegate.setScrollable(getCurrent(Scrollable.class), mAppBar);
        mKeyDelegate.setBackInterceptor(getCurrent(KeyDelegate.BackInterceptor.class));
        return mKeyDelegate.onKeyDown(keyCode, event) ||
                super.onKeyDown(keyCode, event);
    }
