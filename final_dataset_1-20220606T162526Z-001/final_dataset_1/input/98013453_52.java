public void becomingPassive() {
        LOG.warn("Instance becoming passive from {}", state);
        setState(ServiceStateValue.BECOMING_PASSIVE);
    }
