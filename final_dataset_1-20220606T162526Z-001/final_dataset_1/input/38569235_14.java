public boolean isOwnEncounter(@NotNull final long encounterId, @NotNull final String username) {
        Encounter encounter = repository.findByIdAndUsername(encounterId, username);

        boolean owner = encounter != null;

        log.info("User {} is {} owner of encounter {}", username, owner ? "the" : "not the", encounterId);

        return owner;
    }
