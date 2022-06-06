@GET
    @Produces(MediaType.APPLICATION_JSON)
    @ApiOperation(value = "Get an certificate plugin",
            notes = "There is no particular permission needed. User must be authenticated.")
    public void get(
            @PathParam("certificate") String certificateId,
            @Suspended final AsyncResponse response) {

        certificatePluginService.findById(certificateId)
                .map(extensionGrantPlugin -> Response.ok(certificateId).build())
                .switchIfEmpty(Maybe.error(new CertificatePluginNotFoundException(certificateId)))
                .subscribe(response::resume, response::resume);
    }
