@Override
    public void stop() {
        if (getChannel() != null) getChannel().close();
        unregister();
    }
