@GetMapping("/movie/delete/{id}")
    public ResponseEntity<?> deleteMovie(@PathVariable("id") final UUID id) {
        try {
            movieService.deleteMovie(id);

            return ResponseEntity.ok().build();
        }
        catch (final MovieConditionalException ex) {
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
    }
