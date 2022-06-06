@Override
    public void handle(CloudRuntimeEvent<?, ?> event) {
        CloudProcessSuspendedEvent suspendedEvent = (CloudProcessSuspendedEvent) event;
        String processInstanceId = suspendedEvent.getEntity().getId();

        ProcessInstanceEntity processInstanceEntity = processInstanceRepository.findById(processInstanceId)
                .orElseThrow(
                        () -> new QueryException("Unable to find process instance with the given id: " + processInstanceId)
                );
        processInstanceEntity.setStatus(ProcessInstance.ProcessInstanceStatus.SUSPENDED);
        processInstanceEntity.setLastModified(new Date(suspendedEvent.getTimestamp()));
        
        //All important parameters like processDefinitionKey, businessKey, processDefinitionId etc. are already set by CloudProcessCreatedEvent
        processInstanceRepository.save(processInstanceEntity);
    }
