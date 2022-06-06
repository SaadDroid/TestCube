@Override
    public void perform(TranslatorContext context) {
        if (!hasAggregate(context)) {
            return;
        }

        for(ResultNodeDescriptor resultNode : context.getResultNodeList()) {
            if(resultNode.isAggregate()) {
                continue;
            }
            context.getSelectBuilder().groupBy(resultNode.getNode().deepCopy());
        }
    }
