@RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public SavedQuery get(@PathVariable("id") final long id) {
        if(getValidIds().contains(id)) {
            return Optional.ofNullable(service.getDashboardSearch(id))
                .orElseThrow(() -> new IllegalArgumentException("Configured ID " + id + " does not match any known Saved Query"));
        } else {
            throw new IllegalArgumentException("Saved Query ID " + id + " is not in the dashboards configuration file");
        }
    }
