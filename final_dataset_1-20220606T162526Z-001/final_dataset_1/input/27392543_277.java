public static String buildClusterWorkerCommand(String clusterName, String nfsParentDir, String sinkLogRootDir,
      String awsConfDir, String appWorkDir, String masterPublicIp,
      String workerS3ConfUri, String workerS3ConfFiles,
      String workerS3JarsUri, String workerS3JarsFiles, String workerJarsDir,
      String workerJvmMemory, Optional<String> workerJvmArgs, Optional<String> gobblinVersion) {
    final StringBuilder cloudInitCmds = new StringBuilder().append(BASH).append("\n");

    final String clusterWorkerClassName = GobblinAWSTaskRunner.class.getSimpleName();

    // Connect to NFS server
    // TODO: Replace with EFS (it went into GA on 6/30/2016)
    final String nfsDir = nfsParentDir + clusterName;
    final String nfsMountCmd = String.format("mount -t %s %s:%s %s", NFS_TYPE_4, masterPublicIp, nfsDir,
        nfsDir);
    cloudInitCmds.append("mkdir -p ").append(nfsDir).append("\n");
    cloudInitCmds.append(nfsMountCmd).append("\n");

    // Create various other directories
    cloudInitCmds.append("mkdir -p ").append(sinkLogRootDir).append("\n");
    cloudInitCmds.append("chown -R ec2-user:ec2-user /home/ec2-user/*").append("\n");

    // Setup short variables to save cloud-init script space
    if (gobblinVersion.isPresent()) {
      cloudInitCmds.append("vr=").append(gobblinVersion.get()).append("\n");
    }
    cloudInitCmds.append("cg0=").append(workerS3ConfUri).append("\n");
    cloudInitCmds.append("cg=").append(awsConfDir).append("\n");
    cloudInitCmds.append("jr0=").append(workerS3JarsUri).append("\n");
    cloudInitCmds.append("jr=").append(workerJarsDir).append("\n");

    // Download configurations from S3
    final StringBuilder classpath = new StringBuilder();
    final List<String> awsConfs = SPLITTER.splitToList(workerS3ConfFiles);
    for (String awsConf : awsConfs) {
      cloudInitCmds.append(String.format("wget -P \"${cg}\" \"${cg0}\"%s", awsConf)).append("\n");
    }
    classpath.append(awsConfDir);

    // Download jars from S3
    // TODO: Limit only custom user jars to pulled from S3, load rest from AMI
    final List<String> awsJars = SPLITTER.splitToList(workerS3JarsFiles);
    for (String awsJar : awsJars) {
      cloudInitCmds.append(String.format("wget -P \"${jr}\" \"${jr0}\"%s", awsJar)).append("\n");
    }
    classpath.append(":").append(workerJarsDir).append("*");

    // Get a random Helix instance name
    cloudInitCmds.append("pi=`curl http://169.254.169.254/latest/meta-data/local-ipv4`").append("\n");

    // TODO: Add cron that brings back worker if it dies
    // Launch Gobblin Worker
    final StringBuilder launchGobblinClusterWorkerCmd = new StringBuilder()
        .append("java")
        .append(" -cp ").append(classpath)
        .append(" -Xmx").append(workerJvmMemory)
        .append(" ").append(JvmUtils.formatJvmArguments(workerJvmArgs))
        .append(" ").append(GobblinAWSTaskRunner.class.getName())
        .append(" --").append(GobblinClusterConfigurationKeys.APPLICATION_NAME_OPTION_NAME)
        .append(" ").append(clusterName)
        .append(" --").append(GobblinClusterConfigurationKeys.HELIX_INSTANCE_NAME_OPTION_NAME)
        .append(" ").append("$pi")
        .append(" --").append(GobblinAWSConfigurationKeys.APP_WORK_DIR)
        .append(" ").append(appWorkDir)
        .append(" 1>").append(sinkLogRootDir)
        .append(clusterWorkerClassName).append(".")
        .append("$pi").append(".")
        .append(CloudInitScriptBuilder.STDOUT)
        .append(" 2>").append(sinkLogRootDir)
        .append(clusterWorkerClassName).append(".")
        .append("$pi").append(".")
        .append(CloudInitScriptBuilder.STDERR);
    cloudInitCmds.append(launchGobblinClusterWorkerCmd).append("\n");

    final String cloudInitScript = cloudInitCmds.toString();
    LOGGER.info("Cloud-init script for worker node: " + cloudInitScript);

    return encodeBase64(cloudInitScript);
  }
