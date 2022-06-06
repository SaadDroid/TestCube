List<ValidatorSpecification> toValidatorSpecifications(String specification)
    {
        return expandMacros(parse(specification));
    }
