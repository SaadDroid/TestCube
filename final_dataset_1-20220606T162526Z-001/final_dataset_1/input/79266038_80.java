@Override
    public Optional<String> get(ProcessHandle processHandle) {
        Objects.requireNonNull(processHandle, "processHandle cannot be null!");

        try (ProcessToken token = tokenOpener.openToken(processHandle)) {
            return tokenUserFinder.findTokenUser(token).flatMap(tokenOwnerFinder::getUserName);
        } catch (TokenOpenException ex) {
            // loggerino
            return Optional.empty();
        }
    }
