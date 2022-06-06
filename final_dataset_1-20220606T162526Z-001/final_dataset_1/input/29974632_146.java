@RequestMapping(method = RequestMethod.GET)
    public Set<SavedQuery> getAll(
        @RequestParam(name="shared", defaultValue = "false") boolean shared
    ) {
        if (shared) {
            final LinkedHashSet<SavedQuery> toReturn = new LinkedHashSet<>(service.getOwned());
            final Set<Long> ids = toReturn.stream().map(SavedSearch::getId).collect(Collectors.toSet());

            for(SavedQuery sharedQuery : service.getShared()) {
                if (!ids.contains(sharedQuery.getId())) {
                    toReturn.add(sharedQuery);
                }
            }

            return toReturn;
        }

        return service.getOwned();
    }
