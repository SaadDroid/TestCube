@Override
    public boolean validate(Set values) {
        boolean valid = true; //blank or emtpy values set are valid
        if ((values != null) && !values.isEmpty()) {
            for (Object val : values) {
                final String str = ((String)val).trim();
                if (str.length() > 0) {
                    final Matcher m = pattern.matcher(str);
                    valid = m.matches();
                }
            }
        }
        return valid;
    }
