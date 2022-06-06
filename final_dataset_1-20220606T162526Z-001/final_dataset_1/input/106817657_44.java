public static Either<ValidationResult.Builder.ElementStep, FeelExpression> parse(final CharSequence charSequence) {
        try {
            return Eithers.right(PARSER.parse(charSequence));
        } catch (final ParserException e) {
            return Eithers.left(ValidationResult.init.message("Could not parse '" + charSequence + "': " + e.getMessage()));
        }
    }
