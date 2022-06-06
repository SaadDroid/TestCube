@Deprecated
    public static boolean hasModelObjectAnnotation(Object pmo, String modelObjectName) {
        try {
            return ModelObjects.isAccessible(pmo, modelObjectName);
        } catch (org.linkki.core.binding.descriptor.modelobject.ModelObjects.ModelObjectAnnotationException e) {
            throw new ModelObjectAnnotationException(e.getMessage());
        }
    }
