@Override
    public void likeMovie(final String account, final UUID movieId) throws MovieNotFoundException {
        final String url = String.format(LIKE_URL, serviceProperties.getMovieServiceUrl(), movieId, account,
            LocaleContextHolder.getLocale().getLanguage());

        try {
            retryHandler.run(
                () -> {
                    final ResponseEntity<Void> response = restTemplate.getForEntity(url, Void.class);
                    if (response.getStatusCode().equals(HttpStatus.CONFLICT)) {
                        throw new MovieConditionalException();
                    }
                    if (response.getStatusCode().equals(HttpStatus.NOT_FOUND)) {
                        throw new MovieNotFoundException();
                    }

                    return response.getBody();
                },
                ex -> ex instanceof MovieConditionalException);
        }
        catch (final MovieNotFoundException ex) {
            throw ex;
        }
        catch (final Exception ex) {
            final String errorMessage = String.format("An error occured while liking movie %s (%s): %s",
                movieId, account, ex.getMessage());

            log.error(errorMessage, ex);
            throw new MoviePersistenceException(errorMessage, ex);
        }
    }
