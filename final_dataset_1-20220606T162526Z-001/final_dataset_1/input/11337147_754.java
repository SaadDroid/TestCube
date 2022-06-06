@Post("json")
    public void sendMessage(BPMMessage message) {
        validateMandatoryAttributes(message);
        try {
            Map<Expression, Expression> msgContent = new HashMap<>();
            if (message.getMessageContent() != null) {
                for (Map.Entry<String, BPMMessageValue> entry : message.getMessageContent().entrySet()) {
                    msgContent.put(new ExpressionBuilder().createConstantStringExpression(entry.getKey()),
                            getExpressionFromObject(entry));
                }
            }
            Map<Expression, Expression> correlations = new HashMap<>();
            if (message.getCorrelations() != null) {
                int nbCorrelations = message.getCorrelations().size();
                if (nbCorrelations > 5) {
                    throw new IllegalArgumentException(
                            String.format("A maximum of 5 correlations is supported. %s found.", nbCorrelations));
                }
                for (Map.Entry<String, BPMMessageValue> entry : message.getCorrelations().entrySet()) {
                    correlations.put(new ExpressionBuilder().createConstantStringExpression(entry.getKey()),
                            getExpressionFromObject(entry));
                }
            }

            Expression targetFlowNodeExpression = null;
            if (message.getTargetFlowNode() != null) {
                targetFlowNodeExpression = new ExpressionBuilder()
                        .createConstantStringExpression(message.getTargetFlowNode());
            }
            processAPI.sendMessage(message.getMessageName(),
                    new ExpressionBuilder().createConstantStringExpression(message.getTargetProcess()),
                    targetFlowNodeExpression,
                    msgContent,
                    correlations);
        } catch (final SendEventException | InvalidExpressionException e) {
            throw new APIException(e);
        }
    }
