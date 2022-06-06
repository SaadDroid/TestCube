@Override
    public final void handle(ActivateNotification message) {
        onActivate(
            message.getExperiment(),
            message.getUserId(),
            message.getAttributes(),
            message.getVariation(),
            message.getEvent()
        );
    }
