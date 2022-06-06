public List<ContainerNode> getIntersectExceptExprs(String xpath) {
		ContainerNode node = new SimpleXPathParser().parse(xpath);

		if (!isUnionExpr(node))
			return null;

		return splitUnionExprIntoIntersectExceptExprs(node);
	}
