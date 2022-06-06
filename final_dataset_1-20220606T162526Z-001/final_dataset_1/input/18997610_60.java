public void processOperation(Operation operation) {
        final List<Parameter> processedOperationParameters = parameterProcessor.processParameters(operation.getParameters());
        if(processedOperationParameters != null) {
            operation.setParameters(processedOperationParameters);
        }
        final RequestBody requestBody = operation.getRequestBody();
        if(requestBody != null) {
            requestBodyProcessor.processRequestBody(requestBody);
        }


        final Map<String, ApiResponse> responses = operation.getResponses();
        if (responses != null) {
            for (String responseCode : responses.keySet()) {
                ApiResponse response = responses.get(responseCode);
                if(response != null) {
                    if (response.get$ref() != null) {

                        responseProcessor.processResponse(response);

                        RefFormat refFormat = computeRefFormat(response.get$ref());
                        ApiResponse resolvedResponse = cache.loadRef(response.get$ref(), refFormat, ApiResponse.class);

                        if (resolvedResponse != null) {
                            response = resolvedResponse;
                            responses.put(responseCode, resolvedResponse);
                        }
                    }

                    responseProcessor.processResponse(response);

                }
            }
        }

        final Map<String, Callback> callbacks = operation.getCallbacks();
        if (callbacks != null) {
            for (String name : callbacks.keySet()) {
                Callback callback = callbacks.get(name);
                if(callback != null) {
                    if (callback.get$ref() != null){
                        String $ref = callback.get$ref();
                        RefFormat refFormat = computeRefFormat($ref);
                        if (isAnExternalRefFormat(refFormat)){
                            final String newRef = externalRefProcessor.processRefToExternalCallback($ref, refFormat);
                            if (newRef != null) {
                                callback.set$ref(newRef);
                            }
                        }
                    }
                    for(String callbackName : callback.keySet()) {
                        PathItem pathItem = callback.get(callbackName);
                        final Map<PathItem.HttpMethod, Operation> operationMap = pathItem.readOperationsMap();

                        for (PathItem.HttpMethod httpMethod : operationMap.keySet()) {
                            Operation op = operationMap.get(httpMethod);
                            processOperation(op);
                        }

                        List<Parameter> parameters = pathItem.getParameters();
                        if (parameters != null) {
                            for (Parameter parameter : parameters) {
                                parameterProcessor.processParameter(parameter);
                            }
                        }
                    }
                }
            }
        }
    }
