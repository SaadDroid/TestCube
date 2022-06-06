public List<Encounter> getEncountersByEvent(@NotNull final String event) {
        List<Encounter> encounters = repository.findByEventContaining(event);

        log.info("Query for event {} returned {} encounters", event, encounters.size());

        return encounters;
    }
