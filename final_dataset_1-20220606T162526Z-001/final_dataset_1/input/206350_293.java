public DeleteBuilder where(NodeBuilder expression) {
        if(expression != null) {
            node(WHERE_NODE, WhereNode::new).addChild(expression.build());
        }
        return this;
    }
