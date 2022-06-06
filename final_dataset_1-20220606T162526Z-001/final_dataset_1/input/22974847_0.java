@Override
    public int nextInt() throws MissingArgumentException, ArgumentParseException {
        String next = next();
        try {
            return Integer.parseInt(next);
        } catch (NumberFormatException ignored) {
            throw new ArgumentParseException("Expected a number, got '" + next + "'");
        }
    }
