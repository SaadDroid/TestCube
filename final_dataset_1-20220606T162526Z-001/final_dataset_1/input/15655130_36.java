public ComponentDescription createDescription(Class<? extends Component> componentClass) {
		checkArgument(componentClass != null, "Component class is mandatory");

		Documentation documentation = componentClass.getAnnotation(Documentation.class);
		checkArgument(documentation != null, "No documentation found for " + componentClass + " but documentation is mandatory!");

		ComponentDescription description = new ComponentDescription(componentClass, documentation.name(), documentation.description(), documentation.type());
		description.addProperties(propertyDescriptionFactory.createPropertyDescriptions(componentClass));
		description.addInputStreams(inputStreamDescriptionFactory.createInputStreamDescriptions(componentClass));
		description.addOutputStreams(outputStreamDescriptionFactory.createOutputStreamDescriptions(componentClass));
		description.addStates(stateDescriptionFactory.createDescriptions(componentClass));
		
		description.ensureNoDuplicatedInputStreams();
		description.ensureOutputStreamReference();
		description.ensureNoDuplicatedOutputStreams();
		description.ensureNoDuplicatedProperties();
		description.ensureNoDuplicatedStateName();
		
		return description;
	}
