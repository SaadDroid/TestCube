@Override
    public String handleCommand(String command) {
        return new BizCommand(command).process();
    }
