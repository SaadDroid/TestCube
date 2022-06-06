@PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_JSON})
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public void edit(
            @PathParam("id") String id, Team team) {
        teamService.edit(id, team);
    }
