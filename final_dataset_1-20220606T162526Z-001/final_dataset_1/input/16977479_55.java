public void execute() throws ToolException {
        if (hasInfoOption()) {
            return;
        }

        buildToolContext();

        processWadl();

    }
