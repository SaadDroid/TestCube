@Override
    public VerifierResult verify(String hostName) {
        List<ValidationResult> validationResults = new ArrayList<ValidationResult>();
        String hostNameRegex = "^(([a-zA-Z0-9\\*]|[a-zA-Z0-9][a-zA-Z0-9\\-]*[a-zA-Z0-9])\\.)*([A-Za-z0-9]|[A-Za-z0-9][A-Za-z0-9\\-]*[A-Za-z0-9])$";

        try {
            Pattern p = Pattern.compile(hostNameRegex);
            Matcher m = p.matcher(hostName);
            boolean matchFound = m.matches();

            if (matchFound) {
                return new VerifierResult(true);
            } else if (!matchFound) {
                validationResults.add(new ValidationResult(false, "Must provide a valid host name"));
                return new VerifierResult(false, validationResults);
            }

        } catch (PatternSyntaxException exception) {
            validationResults.add(new ValidationResult(false, "Must provide a valid host name"));
            return new VerifierResult(false, validationResults);
        }

        return new VerifierResult(true, validationResults);
    }