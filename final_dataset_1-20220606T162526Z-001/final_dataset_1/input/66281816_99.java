@Override
    public <V extends TiView> V intercept(final V view) {
        if (mLogger != TiLog.NOOP) {
            final V wrapped = wrap(view);
            TiLog.v(TAG, "wrapping View " + view + " in " + wrapped);
            return wrapped;
        }
        return view;
    }
