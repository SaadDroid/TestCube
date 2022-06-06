public List<Confirmation> getConfirmationsByUsername(@NonNull final String username) {
        List<Confirmation> confirmations = repository.findAllByUsername(username);

        log.info("Query for user {} confirmations returned {} confirmations", username, confirmations.size());

        return confirmations;
    }
