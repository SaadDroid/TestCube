static public void addEventListener(AbstractEventListener listener) {
        for (Class<? extends Event> type : listener.interest()) {
            getEntry(type).listeners.addIfAbsent(listener);
        }
    }
