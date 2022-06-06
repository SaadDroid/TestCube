@Override
    public E value(String quotedString)
    {
        String trimmed = quotedString.trim();
        if (trimmed.length() <= 1 || trimmed.charAt(0) != '"' || trimmed.charAt(trimmed.length() - 1) != '"')
        {
            throw new IllegalArgumentException(String.format("%s is not a properly quoted string.", quotedString));
        }
        return mDelegate.value(trimmed.substring(1, trimmed.length() - 1).replace("\\\\", "\\").replace("\\\"", "\""));
    }
