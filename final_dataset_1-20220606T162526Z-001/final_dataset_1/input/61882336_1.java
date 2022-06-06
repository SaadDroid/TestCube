public ExternalTaskDTO createTask(ExternalTaskDTO externalTaskDTO) throws ApiException {
        ApiResponse<ExternalTaskDTO> resp = createTaskWithHttpInfo(externalTaskDTO);
        return resp.getData();
    }
