public Optional<DpnIdType> getFirstHopDataplaneId(RenderedServicePath theRsp) {
        return Optional.ofNullable(theRsp.getRenderedServicePathHop().get(0))
                .map(this::getHopDataplaneId)
                .orElse(Optional.empty());
    }
