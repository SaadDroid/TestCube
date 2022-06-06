public void joinChannel(String channelName) {
        String lowerChannelName = channelName.toLowerCase();

        channelCacheLock.lock();
        try {
            if (currentChannels.add(lowerChannelName)) {
                sendCommand("join", "#" + lowerChannelName);
                log.debug("Joining Channel [{}].", lowerChannelName);
            } else {
                log.warn("Already joined channel {}", channelName);
            }
        } finally {
            channelCacheLock.unlock();
        }
    }
