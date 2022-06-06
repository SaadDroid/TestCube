@Override
    public void deleteMovie(final UUID movieId) {
        final String url = String.format(DELETE_URL, serviceProperties.getMovieServiceUrl(), movieId,
            LocaleContextHolder.getLocale().getLanguage());

        try {
            retryHandler.run(
                () -> {
                    final ResponseEntity<Void> response = restTemplate.getForEntity(url, Void.class);
                    if (response.getStatusCode().equals(HttpStatus.CONFLICT)) {
                        throw new MovieConditionalException();
                    }

                    return true;
                },
                ex -> ex instanceof MovieConditionalException);
        }
        catch (final Exception ex) {
            final String errorMessage = String.format("An error occured while deleting movie %s: %s",
                movieId, ex.getMessage());

            log.error(errorMessage, ex);
            throw new MoviePersistenceException(errorMessage, ex);
        }
    }
