@Override
    public VerifierResult verify(String hostHeader) {
        List<ValidationResult> validationResults = new ArrayList<ValidationResult>();
        String hostNameRegex = "^(([a-zA-Z]|[a-zA-Z][a-zA-Z0-9\\-]*[a-zA-Z0-9])\\.)*([A-Za-z]|[A-Za-z][A-Za-z0-9\\-]*[A-Za-z0-9])$";

        try {
            //Input the string for validation
            Pattern p = Pattern.compile(hostNameRegex);
            //Match the given string with the pattern
            Matcher m = p.matcher(hostHeader);
            //check whether match is found
            boolean matchFound = m.matches();
            if (matchFound) {
                return new VerifierResult(true);
            } else if (!matchFound) {
                validationResults.add(new ValidationResult(false, "Must provide a valid host header name."));
                return new VerifierResult(false, validationResults);
            }

        } catch (PatternSyntaxException exception) {
            validationResults.add(new ValidationResult(false, "Must provide a valid host header name."));
            return new VerifierResult(false, validationResults);
        }
        return new VerifierResult(true, validationResults);
    }
