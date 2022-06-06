@Override
    public void handle(CloudRuntimeEvent<?, ?> event) {
        CloudProcessStartedEvent startedEvent = (CloudProcessStartedEvent) event;
        String processInstanceId = startedEvent.getEntity().getId();
        LOGGER.debug("Handling start of process Instance " + processInstanceId);

        Optional<ProcessInstanceEntity> findResult = processInstanceRepository.findById(processInstanceId);
        ProcessInstanceEntity processInstanceEntity = findResult.orElseThrow(
                () -> new QueryException("Unable to find process instance with the given id: " + processInstanceId));
        if (ProcessInstance.ProcessInstanceStatus.CREATED.equals(processInstanceEntity.getStatus())) {
            processInstanceEntity.setStatus(ProcessInstance.ProcessInstanceStatus.RUNNING);
            //instance name is not available in ProcessCreatedEvent, so we need to updated it here
            processInstanceEntity.setName(startedEvent.getEntity().getName());
            processInstanceEntity.setLastModified(new Date(startedEvent.getTimestamp()));
            processInstanceRepository.save(processInstanceEntity);
        }
    }
