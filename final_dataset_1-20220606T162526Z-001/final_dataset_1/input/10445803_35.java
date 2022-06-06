public Date convert(String input,
            Class<? extends Date> targetType,
            Collection<ValidationError> errors) {

        // Step 1: pre-process the input to make it more palatable
        String parseable = preProcessInput(input);

        // Step 2: try really hard to parse the input
        Date date = null;

        for (DateFormat format : this.formats) {
            try {
                date = format.parse(parseable);
                break;
            } catch (ParseException pe) {
                /* Do nothing, we'll get lots of these. */ }
        }

        // Step 3: If we successfully parsed, return a date, otherwise send back an error
        if (date != null) {
            return date;
        } else {
            errors.add(new ScopedLocalizableError("converter.date", "invalidDate"));
            return null;
        }
    }
