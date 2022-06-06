public FieldValidator createValidators(Field field, String specification)
    {
        List<ValidatorSpecification> specs = toValidatorSpecifications(specification);

        List<FieldValidator> fieldValidators = CollectionFactory.newList();

        for (ValidatorSpecification spec : specs)
        {
            fieldValidators.add(createValidator(field, spec.getValidatorType(), spec.getConstraintValue()));
        }

        if (fieldValidators.size() == 1)
            return fieldValidators.get(0);

        return new CompositeFieldValidator(fieldValidators);
    }
