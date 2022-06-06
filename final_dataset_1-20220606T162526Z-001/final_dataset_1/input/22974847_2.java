@Override
    public short nextShort() throws MissingArgumentException, ArgumentParseException {
        String next = next();
        try {
            return Short.parseShort(next);
        } catch (NumberFormatException ignored) {
            throw new ArgumentParseException("Expected a number, got '" + next + "'");
        }
    }
