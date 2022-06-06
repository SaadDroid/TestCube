protected void checkPreconditions() throws ResourceUnavailableException {
        if (guestNetwork.getState() != Network.State.Implemented && guestNetwork.getState() != Network.State.Setup && guestNetwork.getState() != Network.State.Implementing) {
            throw new ResourceUnavailableException("Network is not yet fully implemented: " + guestNetwork, Network.class, guestNetwork.getId());
        }

        if (guestNetwork.getTrafficType() != TrafficType.Guest) {
            throw new ResourceUnavailableException("Network is not type Guest as expected: " + guestNetwork, Network.class, guestNetwork.getId());
        }
    }
