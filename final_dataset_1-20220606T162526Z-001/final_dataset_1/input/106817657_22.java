public static Either<ValidationResult.Builder.ElementStep, ExpressionType> typecheck(final FeelExpression expression) {
        return typecheck(new Context(), expression);
    }
