@Override
    public boolean compareWith(final Object[] newParameters) {
        if (mLastParameters == null || !Arrays.equals(newParameters, mLastParameters.get())) {
            mLastParameters = new WeakReference<>(newParameters);
            return false;
        }
        return true;
    }
