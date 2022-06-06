void notify(Context context, Intent intent) {
        if (intent != null && connectivityActionMatchesActionFor(intent)) {
            MerlinsBeard merlinsBeard = merlinsBeardCreator.createMerlinsBeard(context);
            ConnectivityChangeEvent connectivityChangeEvent = creator.createFrom(intent, merlinsBeard);
            notifyMerlinService(context, connectivityChangeEvent);
        }
    }
