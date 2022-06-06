public static ModelNode validateOperation(ModelNode operation) {
        ModelNode responseNode = new ModelNode();
        StringBuilder errors = new StringBuilder();
        if (!operation.hasDefined(OP) || operation.get(OP).asString() == null || operation.get(OP).asString().isEmpty()) {
            errors.append(ControllerLogger.ROOT_LOGGER.noOperationDefined(operation));
        }
        if (operation.hasDefined(OP_ADDR)) {
            try {
                if(operation.get(OP_ADDR).getType() == ModelType.STRING) {
                    ModelNode address = PathAddress.parseCLIStyleAddress(operation.get(OP_ADDR).asString()).toModelNode();
                    operation.get(OP_ADDR).set(address);
                } else {
                    operation.get(OP_ADDR).asList();
                }
            } catch (IllegalArgumentException ex) {
                if (errors.length() > 0) {
                    errors.append(System.lineSeparator());
                }
                if(ex.getMessage() != null) {
                    errors.append(ex.getMessage());
                } else {
                    errors.append(ControllerLogger.ROOT_LOGGER.attributeIsWrongType(OP_ADDR, ModelType.LIST, operation.get(OP_ADDR).getType()).getMessage());
                }
            }
        }
        if (errors.length() > 0) {
            responseNode.get(OUTCOME).set(FAILED);
            responseNode.get(FAILURE_DESCRIPTION).set(errors.toString());
        }
        return responseNode;
    }
