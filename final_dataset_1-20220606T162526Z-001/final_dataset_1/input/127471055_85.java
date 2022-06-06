@Override
    public void deleteAccount(final String username) {
        try {
            accountRepository.deleteById(username);
        }
        catch (final Exception ex) {
            final String errorMessage = String.format("An error occured while deleting account %s: %s", username,
                ex.getMessage());

            log.error(errorMessage, ex);
            throw new AccountPersistenceException(errorMessage, ex);
        }
    }
