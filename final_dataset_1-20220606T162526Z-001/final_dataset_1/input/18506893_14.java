@Override
    public void execute(JavaExecSpec executor) {
        executor.classpath(classpath);
        executor.setMain("org.javacc.jjtree.Main");
        executor.args((Object[]) arguments.toArray());
        executor.setIgnoreExitValue(true);
    }
