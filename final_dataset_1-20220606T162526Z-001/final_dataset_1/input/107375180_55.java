public static <A extends Annotation> LinkkiComponentDefinition getComponentDefinition(
            A annotation,
            AnnotatedElement annotatedElement) {
        LinkkiComponent linkkiComponent = LINKKI_COMPONENT_ANNOTATION.findOn(annotation)
                .orElseThrow(LINKKI_COMPONENT_ANNOTATION
                        .missingAnnotation(annotation, annotatedElement, ComponentAnnotationReader.class.getSimpleName()
                                + "#isComponentDefinition(Annotation)"));
        @SuppressWarnings("unchecked")
        Class<ComponentDefinitionCreator<A>> creatorClass = (Class<ComponentDefinitionCreator<A>>)linkkiComponent
                .value();
        return Classes.instantiate(creatorClass).create(annotation, annotatedElement);
    }
