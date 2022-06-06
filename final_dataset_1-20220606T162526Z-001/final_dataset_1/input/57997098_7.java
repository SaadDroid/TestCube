public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_onKeyDown(keyCode, event);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final CallFun2<Boolean, Integer, KeyEvent> superCall = new CallFun2<Boolean, Integer, KeyEvent>(
                "onKeyDown(Integer, KeyEvent)") {

            @Override
            public Boolean call(final Integer keyCode, final KeyEvent event) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().onKeyDown(this, keyCode, event);
                } else {
                    return getOriginal().super_onKeyDown(keyCode, event);
                }
            }
        };
        return superCall.call(keyCode, event);
    }
