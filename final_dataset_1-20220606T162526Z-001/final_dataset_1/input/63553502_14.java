@Nonnull
    public static String getPathInWorkspace(@Nonnull final String absoluteFilePath, @Nonnull FilePath workspace) {
        boolean windows = FileUtils.isWindows(workspace);

        final String workspaceRemote = workspace.getRemote();

        String sanitizedAbsoluteFilePath;
        String sanitizedWorkspaceRemote;
        if (windows) {
            // sanitize to workaround JENKINS-44088
            sanitizedWorkspaceRemote = workspaceRemote.replace('/', '\\');
            sanitizedAbsoluteFilePath = absoluteFilePath.replace('/', '\\');
        } else if (workspaceRemote.startsWith("/var/") && absoluteFilePath.startsWith("/private/var/")) {
            // workaround MacOSX special folders path
            // eg String workspace = "/var/folders/lq/50t8n2nx7l316pwm8gc_2rt40000gn/T/jenkinsTests.tmp/jenkins3845105900446934883test/workspace/build-on-master-with-tool-provided-maven";
            // eg String absolutePath = "/private/var/folders/lq/50t8n2nx7l316pwm8gc_2rt40000gn/T/jenkinsTests.tmp/jenkins3845105900446934883test/workspace/build-on-master-with-tool-provided-maven/pom.xml";
            sanitizedWorkspaceRemote = workspaceRemote;
            sanitizedAbsoluteFilePath = absoluteFilePath.substring("/private".length());
        } else {
            sanitizedAbsoluteFilePath = absoluteFilePath;
            sanitizedWorkspaceRemote = workspaceRemote;
        }

        if (StringUtils.startsWithIgnoreCase(sanitizedAbsoluteFilePath, sanitizedWorkspaceRemote)) {
            // OK
        } else if (sanitizedWorkspaceRemote.contains("/workspace/") && sanitizedAbsoluteFilePath.contains("/workspace/")) {
            // workaround JENKINS-46084
            // sanitizedAbsoluteFilePath = '/app/Jenkins/home/workspace/testjob/pom.xml'
            // sanitizedWorkspaceRemote = '/var/lib/jenkins/workspace/testjob'
            sanitizedAbsoluteFilePath = "/workspace/" + StringUtils.substringAfter(sanitizedAbsoluteFilePath, "/workspace/");
            sanitizedWorkspaceRemote = "/workspace/" + StringUtils.substringAfter(sanitizedWorkspaceRemote, "/workspace/");
        } else if (sanitizedWorkspaceRemote.endsWith("/workspace") && sanitizedAbsoluteFilePath.contains("/workspace/")) {
            // workspace = "/var/lib/jenkins/jobs/Test-Pipeline/workspace";
            // absolutePath = "/storage/jenkins/jobs/Test-Pipeline/workspace/pom.xml";
            sanitizedAbsoluteFilePath = "workspace/" + StringUtils.substringAfter(sanitizedAbsoluteFilePath, "/workspace/");
            sanitizedWorkspaceRemote = "workspace/";
        } else {
            throw new IllegalArgumentException("Cannot relativize '" + absoluteFilePath + "' relatively to '" + workspace.getRemote() + "'");
        }

        String relativePath = StringUtils.removeStartIgnoreCase(sanitizedAbsoluteFilePath, sanitizedWorkspaceRemote);
        String fileSeparator = windows ? "\\" : "/";

        if (relativePath.startsWith(fileSeparator)) {
            relativePath = relativePath.substring(fileSeparator.length());
        }
        LOGGER.log(Level.FINEST, "getPathInWorkspace({0}, {1}: {2}", new Object[]{absoluteFilePath, workspaceRemote, relativePath});
        return relativePath;
    }
