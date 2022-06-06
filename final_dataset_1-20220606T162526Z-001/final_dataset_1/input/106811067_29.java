@Override
    public void handle(CloudRuntimeEvent<?, ?> event) {
        CloudProcessCompletedEvent completedEvent = (CloudProcessCompletedEvent) event;
        String processInstanceId = completedEvent.getEntity().getId();
        Optional<ProcessInstanceEntity> findResult = processInstanceRepository.findById(processInstanceId);
        if (findResult.isPresent()) {
            ProcessInstanceEntity processInstanceEntity = findResult.get();
            processInstanceEntity.setStatus(ProcessInstance.ProcessInstanceStatus.COMPLETED);
            processInstanceEntity.setLastModified(new Date(completedEvent.getTimestamp()));
            processInstanceRepository.save(processInstanceEntity);
        } else {
            throw new QueryException("Unable to find process instance with the given id: " + processInstanceId);
        }
    }
