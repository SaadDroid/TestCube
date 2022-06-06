@Process(actionType = PauseFollowLogFile.class)
    public void pauseFollow(final Dispatcher.Channel channel) {
        if (activeLogFile == null) {
            channel.nack(new IllegalStateException("Unable to pause follow: No active log file!"));
            return;
        }

        pauseFollow = true;
        channel.ack();
    }
