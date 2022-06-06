@Override
    public boolean nextBoolean() throws MissingArgumentException, ArgumentParseException {
        String next = next();
        if (next.equalsIgnoreCase("yes") || next.equalsIgnoreCase("true") || next.equalsIgnoreCase("y") || next.equalsIgnoreCase("1")) {
            return true;
        } else if (next.equalsIgnoreCase("no") || next.equalsIgnoreCase("false") || next.equalsIgnoreCase("n") || next.equalsIgnoreCase("0")) {
            return false;
        } else {
            throw new ArgumentParseException("Expected a boolean (yes/no), got '" + next + "'");
        }
    }
