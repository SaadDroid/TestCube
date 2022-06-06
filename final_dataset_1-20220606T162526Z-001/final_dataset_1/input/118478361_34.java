@Override
    public String string(Object from) {
        try {
            return this.stringLib.string(from);
        } catch (Exception e) {
            String message = String.format("string(%s)", from);
            logError(message, e);
            return null;
        }
    }
