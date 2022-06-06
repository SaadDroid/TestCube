public Object createContainerComponent(ContainerPmo<?> containerPmo, BindingContext bindingContext) {
        ComponentWrapper tableWrapper = containerComponentCreator
                .createComponent(requireNonNull(containerPmo, "containerPmo must not be null"));
        requireNonNull(bindingContext, "bindingContext must not be null");
        List<LinkkiAspectDefinition> tableAspects = AspectAnnotationReader
                .createAspectDefinitionsFor(containerPmo.getClass());
        ContainerBinding binding = bindingContext.bindContainer(containerPmo, BoundProperty.empty(), tableAspects,
                                                                tableWrapper);
        createColumns(containerPmo, tableWrapper, binding);
        // need to update binding after columns are created because the footer content cannot be updated
        // without columns
        binding.updateFromPmo();
        return tableWrapper.getComponent();
    }
