public static CoordinatorRegistryCenter createCoordinatorRegistryCenter(final String connectString, final String namespace, final Optional<String> digest) {
        Hasher hasher =  Hashing.md5().newHasher().putString(connectString, Charsets.UTF_8).putString(namespace, Charsets.UTF_8);
        if (digest.isPresent()) {
            hasher.putString(digest.get(), Charsets.UTF_8);
        }
        HashCode hashCode = hasher.hash();
        if (registryCenterMap.containsKey(hashCode)) {
            return registryCenterMap.get(hashCode);
        }
        ZookeeperConfiguration zkConfig = new ZookeeperConfiguration(connectString, namespace);
        if (digest.isPresent()) {
            zkConfig.setDigest(digest.get());
        }
        CoordinatorRegistryCenter result = new ZookeeperRegistryCenter(zkConfig);
        result.init();
        registryCenterMap.putIfAbsent(hashCode, result);
        return result;
    }
