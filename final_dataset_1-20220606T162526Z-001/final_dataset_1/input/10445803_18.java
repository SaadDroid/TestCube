public String convert(String input, Class<? extends String> targetType, Collection<ValidationError> errors) {
        // Remove any non-numeric characters
        String cardNumber = input.replaceAll("\\D", "");

        if (getCardType(cardNumber) != null) {
            return cardNumber;
        }

        errors.add(new ScopedLocalizableError("converter.creditCard", "invalidCreditCard"));
        return null;
    }
