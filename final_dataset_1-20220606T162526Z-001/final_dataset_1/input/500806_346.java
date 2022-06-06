public static boolean evaluate(final String expression) {
        final Deque<String> operators = new ArrayDeque<>();
        final Deque<String> values = new ArrayDeque<>();
        final boolean result;

        char currentCharacter;
        int currentCharacterIndex = 0;

        try {
            while (currentCharacterIndex < expression.length()) {
                currentCharacter = expression.charAt(currentCharacterIndex);

                if (SeparatorToken.OPEN_PARENTHESIS.value == currentCharacter) {
                    operators.push(SeparatorToken.OPEN_PARENTHESIS.toString());
                    currentCharacterIndex += moveCursor(SeparatorToken.OPEN_PARENTHESIS.toString());
                } else if (SeparatorToken.SPACE.value == currentCharacter) {
                    currentCharacterIndex += moveCursor(SeparatorToken.SPACE.toString());
                } else if (SeparatorToken.CLOSE_PARENTHESIS.value == currentCharacter) {
                    evaluateSubexpression(operators, values);
                    currentCharacterIndex += moveCursor(SeparatorToken.CLOSE_PARENTHESIS.toString());
                } else if (!Character.isDigit(currentCharacter)) {
                    final String parsedNonDigit = parseNonDigits(expression, currentCharacterIndex);
                    if (isBoolean(parsedNonDigit)) {
                        values.push(replaceBooleanStringByIntegerRepresentation(parsedNonDigit));
                    } else {
                        operators.push(validateOperator(parsedNonDigit));
                    }
                    currentCharacterIndex += moveCursor(parsedNonDigit);
                } else if (Character.isDigit(currentCharacter)) {
                    final String parsedDigits = parseDigits(expression, currentCharacterIndex);
                    values.push(parsedDigits);
                    currentCharacterIndex += moveCursor(parsedDigits);
                }
            }

            result = Boolean.valueOf(evaluateExpressionStack(operators, values));

            if (log.isDebugEnabled()) {
                log.debug("Boolean expression {} evaluates to {}", expression, result);
            }
        } catch (final NoSuchElementException e) {
            throw new CitrusRuntimeException("Unable to parse boolean expression '" + expression + "'. Maybe expression is incomplete!", e);
        }

        return result;
    }
