@Override
    public FileTree getJavaSourceTree() {
        FileTree javaSourceTree = null;

        for (JavaCompile task : javaCompileTasks) {
            if (javaSourceTree == null) {
                javaSourceTree = task.getSource();
            } else {
                javaSourceTree = javaSourceTree.plus(task.getSource());
            }
        }

        return excludeOutputDirectory(javaSourceTree);
    }
