@Process(actionType = SelectLogFile.class)
    public void selectLogFile(final SelectLogFile action, final Dispatcher.Channel channel) {
        final LogFile logFile = states.get(action.getName());
        if (logFile == null) {
            channel.nack(new IllegalStateException("Cannot select unknown log file " + action.getName() + ". " +
                    "Please open the log file first!"));
            return;
        }
        activate(logFile);
        channel.ack();
    }
