public static FlowActionSelectorSpecification define() {
		FlowSpec flowSpec = new FlowSpec();
		FlowActionSelectorSpecification flowSelectorSpecification = new FlowActionSelectorSpecification(
				flowSpec);
		return flowSelectorSpecification;
	}
