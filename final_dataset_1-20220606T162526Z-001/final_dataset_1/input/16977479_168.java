public void execute(boolean exitOnFinish) {
        WSDLToCorbaProcessor corbaProcessor = new WSDLToCorbaProcessor();
        ProcessorEnvironment env = null;

        try {
            super.execute(exitOnFinish);
            if (!hasInfoOption()) {
                env = new ProcessorEnvironment();
                env.setParameters(getParametersMap(getArrayKeys()));
                if (isVerboseOn()) {
                    env.put(ToolConstants.CFG_VERBOSE, Boolean.TRUE);
                }
                env.put(ToolConstants.CFG_CMD_ARG, args);

                CommandDocument doc = super.getCommandDocument();
                if (doc.hasParameter("corba")) {
                    env.put(ToolCorbaConstants.CFG_CORBA, Boolean.TRUE);
                }
                if (doc.hasParameter("idl")) {
                    env.put(ToolCorbaConstants.CFG_IDL, Boolean.TRUE);
                }

                initialise(env);
                validate(env);
                corbaProcessor.setEnvironment(env);
                corbaProcessor.process();
            }
        } catch (ToolException ex) {
            err.println("Error : " + ex.getMessage());
            if (ex.getCause() instanceof BadUsageException) {
                printUsageException(TOOL_NAME, (BadUsageException)ex.getCause());
            }
            err.println();
            if (isVerboseOn()) {
                ex.printStackTrace(err);
            }
            throw ex;
        } catch (Exception ex) {
            err.println("Error : " + ex.getMessage());
            err.println();
            if (isVerboseOn()) {
                ex.printStackTrace(err);
            }
            throw new ToolException(ex.getMessage(), ex.getCause());
        }
    }
