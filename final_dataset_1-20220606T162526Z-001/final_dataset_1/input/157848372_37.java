@Override
    public Flux<MissionRepresentation> representationsFor(MissionHandle handle) {
        return clientUtils.flux(MoleWebApi.instanceRepresentationsUrl(handle.id()), MissionRepresentationDto.class)
                .map(MissionRepresentationDto::toMissionRepresentation);
    }
