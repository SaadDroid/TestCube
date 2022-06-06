public static void analyzeClassDependencies(String  className) {
        String cp = ClassPathHandler.getInstance().getTargetProjectClasspath();
        List<String> cpList = Arrays.asList(cp.split(File.pathSeparator));
        Properties.TARGET_CLASS=className;
        try {
            LOG.info("Starting the dependency analysis. The number of detected jar files is {}.",cpList.size());
            DependencyAnalysis.analyzeClass(className,Arrays.asList(cp.split(File.pathSeparator)));
            LOG.info("Analysing dependencies done!");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
