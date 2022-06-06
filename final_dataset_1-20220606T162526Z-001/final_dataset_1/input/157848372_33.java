@GetMapping(path = MISSION_REPRESENTATION_PATH)
    public Mono<MissionRepresentationDto> representationOf(@PathVariable(MISSION_NAME) String missionName) {
        return mole.representationOf(new Mission(missionName)).map(MissionRepresentationDto::from);
    }
