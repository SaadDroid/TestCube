@Override
    public void instruct(MissionHandle handle, Strand strand, StrandCommand command) {
        clientUtils.post(MoleWebApi.instructInstance(handle.id(),strand.id(),command.name()), MediaType.APPLICATION_JSON, BodyInserters.empty());
    }
