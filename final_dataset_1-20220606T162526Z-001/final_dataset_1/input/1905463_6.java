public Object getValue(Object target, Object property)
            throws GenericElEvaluationException, PropertyNotFoundException {
        return this.getValue(target, property, getTypeOfCollectionOrBean(target, property));
    }
