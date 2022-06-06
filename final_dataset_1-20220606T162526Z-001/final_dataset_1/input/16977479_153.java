public static void run(String[] arguments) throws Exception {
        ToolRunner.runTool(IDLToWSDL.class, IDLToWSDL.class
                           .getResourceAsStream(ToolCorbaConstants.TOOLSPECS_BASE + "idl2wsdl.xml"),
                           false,
                           arguments);
    }
