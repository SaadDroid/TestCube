static void moveJavaHomeToTarget(final Path searchRoot, final Path targetDir) {
        if (Files.isDirectory(searchRoot)) {
            try {
                Files.find(searchRoot, 5, JdkFinder::isJavaHome)
                        .map(Path::toAbsolutePath)
                        .map(Path::normalize)
                        .min(Comparator.comparingInt(Path::getNameCount))
                        .map(ExtractUtil::listFiles)
                        .ifPresent(javaHomeContent -> javaHomeContent.forEach(file -> moveToDirAndReplace(targetDir, file)));
            } catch (final IOException e) {
                throw new RuntimeException("Error while searching for local JVMs at '" + searchRoot + "'", e);
            }
        }
    }
