@SneakyThrows(NoSuchAlgorithmException.class)
    public DependencyLoader downloadDependencies(DependencySet dependencySet) throws IOException {
        initDependencyStore();
        for (Dependency dependency : dependencySet.getDependencies()) {
            URL cached = dependencyStore.getCachedDependency(dependency);
            if (cached == null) {
                logger.info("Downloading " + dependency.getUrl());
                MessageDigest digest = MessageDigest.getInstance("SHA-512");
                @SuppressWarnings("resource")
                ByteArrayOutputStream memoryStream = new ByteArrayOutputStream();
                try (InputStream stream = dependency.getUrl().openStream()) {
                    byte[] buf = new byte[4096];
                    int len;
                    while ((len = stream.read(buf)) >= 0) {
                        digest.update(buf, 0, len);
                        memoryStream.write(buf, 0, len);
                    }
                }
                byte[] hash = digest.digest();
                if (!Arrays.equals(hash, dependency.getSha512sum())) {
                    throw new IOException("Mismatched hash on " + dependency.getUrl() + ": expected " +
                                          DatatypeConverter.printHexBinary(dependency.getSha512sum()) + " but got " +
                                          DatatypeConverter.printHexBinary(hash));
                }
                cached = dependencyStore.saveDependency(dependency, memoryStream.toByteArray());
            }
            urls.add(cached);
        }
        logger.info("Added " + dependencySet.getDependencies().size() + " dependencies.");
        return this;
    }
