protected void onCreate() {
        if (mCalled) {
            throw new IllegalAccessError("don't call #onCreate() directly, call #create()");
        }
        mCalled = true;
    }
