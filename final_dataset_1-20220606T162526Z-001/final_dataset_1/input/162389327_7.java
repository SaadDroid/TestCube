@DELETE
    @Path("{id}")
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public void remove(
            @PathParam("id") Integer id) {
        super.remove(super.find(id));
    }
