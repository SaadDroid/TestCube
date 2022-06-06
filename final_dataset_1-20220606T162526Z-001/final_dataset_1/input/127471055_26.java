@Override
    public MovieDto getMovie(final UUID id) throws MovieNotFoundException {
        final String url = String.format(GET_URL, serviceProperties.getMovieServiceUrl(), id,
            LocaleContextHolder.getLocale().getLanguage());

        try {
            final ResponseEntity<MovieDto> response = restTemplate.getForEntity(url, MovieDto.class);
            if (response.getStatusCode().equals(HttpStatus.NOT_FOUND)) {
                throw new MovieNotFoundException();
            }

            return response.getBody();
        }
        catch (final MovieNotFoundException ex) {
            throw ex;
        }
        catch (final Exception ex) {
            final String errorMessage = String.format("An error occured while fetching movie %s", id, ex.getMessage());

            log.error(errorMessage, ex);
            throw new MoviePersistenceException(errorMessage, ex);
        }
    }
