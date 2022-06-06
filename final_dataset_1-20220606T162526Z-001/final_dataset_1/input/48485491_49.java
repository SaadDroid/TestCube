@Override
    public DomainObject get() throws PromiseBrokenException, InterruptedException {
        try {
            ServiceResponse<DomainObject> serviceResponse = new ServiceResponse<>();
            for (Future<TaskResult> futureResult : futureList) {
                TaskResult result = futureResult.get();
                if (result == null) {
                    throw new PromiseBrokenException("Task result is null");
                }
                ServiceResponse<DomainObject> response = (ServiceResponse<DomainObject>) result.getData();
                if (!response.getIsSuccess())
                    throw response.getException();
                serviceResponse.addData(response.getDataList());
            }
            if (responseMerger != null) {
                return responseMerger.mergeResponse(serviceResponse.getDataList());
            } else {
                return serviceResponse.getDataList().get(0);
            }
        } catch (ExecutionException exception) {
            checkAndThrowServiceClientException(exception);
            checkAndThrowOriginalException(exception);
            throw new InterruptedException(exception.getMessage());
        } catch (CancellationException exception) {
            throw new PromiseBrokenException(exception);
        }
    }
