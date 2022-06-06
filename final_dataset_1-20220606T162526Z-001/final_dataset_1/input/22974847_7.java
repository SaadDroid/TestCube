@Override
    public double nextDouble() throws MissingArgumentException, ArgumentParseException {
        String next = next();
        try {
            return Double.parseDouble(next);
        } catch (NumberFormatException ignored) {
            throw new ArgumentParseException("Expected a number, got '" + next + "'");
        }
    }
