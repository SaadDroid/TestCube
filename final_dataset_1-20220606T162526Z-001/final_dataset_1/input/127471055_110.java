@Override
    public void unlikeMovie(final UUID movieId, final String account)
        throws MovieConditionalException, MovieNotFoundException {

        try {
            final Movie movie = movieRepository.findById(movieId.toString())
                .orElseThrow(() -> new MovieNotFoundException());
            if (movie.isDeleted()) {
                throw new MovieNotFoundException();
            }

            final String currentRevision = movie.getRevision();
            movie.setRevision(UUID.randomUUID().toString());
            movie.setUpdated(true);
            movie.getPendingLikes().remove(account);
            movie.getPendingUnlikes().add(account);

            final long affectedDocuments = movieRepository.updateMovie(movie, currentRevision);
            if (affectedDocuments == 0) {
                throw new MovieConditionalException();
            }

            movieIndexHelper.indexMovie(movie);
        }
        catch (final MovieNotFoundException | MovieConditionalException ex) {
            throw ex;
        }
        catch (final Exception ex) {
            final String errorMessage = String.format("An error occured while updating movie %s: %s", movieId,
                ex.getMessage());

            log.error(errorMessage, ex);
            throw new MoviePersistenceException(errorMessage, ex);
        }
    }
