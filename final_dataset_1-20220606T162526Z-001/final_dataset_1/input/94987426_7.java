@Decision(value = MALFORMED, method = "POST")
    public Problem validateCreateRequest(PasswordCredentialCreateRequest createRequest, RestContext context, EntityManager em) {
        if (createRequest == null) {
            return builder(Problem.valueOf(400, "request is empty"))
                    .set(Problem::setType, BouncrProblem.MALFORMED.problemUri())
                    .build();
        }
        PasswordPolicyService passwordPolicyService = new PasswordPolicyService(config.getPasswordPolicy(), em);
        Set<ConstraintViolation<PasswordCredentialCreateRequest>> violations = validator.validate(createRequest);
        Problem problem = builder(Problem.fromViolations(violations))
                .set(Problem::setType, BouncrProblem.MALFORMED.problemUri())
                .build();
        Optional.ofNullable(passwordPolicyService.validateCreatePassword(createRequest))
                .ifPresent(violation -> problem.getViolations().add(violation));

        if (problem.getViolations().isEmpty()) {
            context.putValue(createRequest);
        }
        return problem.getViolations().isEmpty() ? null : problem;
    }
