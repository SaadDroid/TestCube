@GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<Team> findAll() {
        return teamService.getTeams();
    }
