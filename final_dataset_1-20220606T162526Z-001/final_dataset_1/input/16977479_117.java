public void run() throws Exception {
        ToolRunner.runTool(JavaToWSContainer.class, JavaToWSContainer.class
                           .getResourceAsStream("java2ws.xml"), false, args);
    }
