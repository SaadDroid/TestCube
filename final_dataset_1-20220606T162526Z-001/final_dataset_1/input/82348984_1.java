@SuppressLint("NewApi")
    public static void destroy() {
        if (isInitialized()) {
            if (instance.mAutomaticSaveStateManager != null) {
                instance.mApplication.unregisterActivityLifecycleCallbacks(instance.mAutomaticSaveStateManager);
            }
            // Avoid memory leak bringing Application instance to null.
            instance.mApplication = null;
            instance = null;
        }
    }
