public void shutdown() {
        this.shutdown = true;
        getLogger().log(Level.FINE, "JMSDestination shutdown()");
        this.deactivate();
    }
