public void doSomethingWithPerson(Person person){
        Set<ConstraintViolation<Person>> resultOfValidation = validator.validate(person);
        for (ConstraintViolation<Person> constraintViolation : resultOfValidation) {
            throw new IllegalArgumentException(constraintViolation.getMessage());
        }
    }
