@Override
    public void process(Archive<?> applicationArchive, TestClass testClass) {
        if (getConfiguration().isAutoPackage() &&
                (applicationArchive instanceof EnterpriseArchive || applicationArchive instanceof WebArchive)) {
            addDependencies(applicationArchive);
        }
    }
