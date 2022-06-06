@VisibleForTesting
  String setupGobblinCluster() throws IOException {

    final String uuid = UUID.randomUUID().toString();

    // Create security group
    // TODO: Make security group restrictive
    final String securityGroupName = "GobblinSecurityGroup_" + uuid;
    this.awsSdkClient.createSecurityGroup(securityGroupName, "Gobblin cluster security group");
    this.awsSdkClient.addPermissionsToSecurityGroup(securityGroupName,
        "0.0.0.0/0",
        "tcp",
        0,
        65535);

    // Create key value pair
    final String keyName = "GobblinKey_" + uuid;
    final String material = this.awsSdkClient.createKeyValuePair(keyName);
    LOGGER.debug("Material is: " + material);
    FileUtils.writeStringToFile(new File(keyName + ".pem"), material);

    // Get all availability zones in the region. Currently, we will only use first
    final List<AvailabilityZone> availabilityZones = this.awsSdkClient.getAvailabilityZones();

    // Launch Cluster Master
    final String clusterId = launchClusterMaster(uuid, keyName, securityGroupName, availabilityZones.get(0));

    // Launch WorkUnit runners
    launchWorkUnitRunners(uuid, keyName, securityGroupName, availabilityZones.get(0));

    return clusterId;
  }
