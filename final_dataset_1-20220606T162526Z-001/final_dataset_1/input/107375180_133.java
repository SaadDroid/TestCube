public static Supplier<Object> supplierFor(Object pmo, String modelObjectName) {
        Member accessMember = getModelObjectAccessMember(pmo, modelObjectName)
                .orElseThrow(() -> ModelObjectAnnotationException.noAnnotatedMember(pmo.getClass(), modelObjectName));
        return () -> MemberAccessors.getValue(pmo, accessMember);
    }
