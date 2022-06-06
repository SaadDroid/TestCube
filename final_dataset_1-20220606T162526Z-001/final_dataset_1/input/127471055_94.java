@Override
    public MoviePagedResultModel searchMovies(final Optional<String> text, final Optional<Integer> pageNumber,
        final Optional<String> sortField, final boolean isAscending) {

        try {
            final String requiredSortField = (sortField.isPresent() && SORT_FIELDS.contains(sortField.get()))
                ? sortField.get()
                : SORT_FIELDS.get(0);

            final Pageable pageable = PageRequest.of(
                Math.max(0, pageNumber.orElse(0)),
                PAGE_SIZE,
                isAscending ? Direction.ASC : Direction.DESC,
                requiredSortField);

            final Page<MovieIndex> page = movieIndexRepository.search(text, pageable);
            final List<MovieDto> results = page.getContent()
                .stream()
                .map(movieMapper::movieIndexToMovieDto)
                .collect(Collectors.toList());

            return MoviePagedResultModel.builder()
                .entries(results)
                .pageNumber(page.getNumber())
                .totalPages(page.getTotalPages())
                .sortField(requiredSortField)
                .isAscending(isAscending)
                .build();
        }
        catch (final Exception ex) {
            final String errorMessage = String.format("An error occured while searching movies: %s", ex.getMessage());

            log.error(errorMessage, ex);
            throw new MoviePersistenceException(errorMessage, ex);
        }
    }
