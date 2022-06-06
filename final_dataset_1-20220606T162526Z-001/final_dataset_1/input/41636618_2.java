@Nullable
    @SneakyThrows({ MalformedURLException.class, NoSuchAlgorithmException.class })
    @VisibleForTesting
    Dependency findArtifactInRepository(Artifact artifact, ArtifactRepository repository)
            throws MojoExecutionException {

        String artifactPath = getArtifactPath(artifact, artifact.getVersion());
        if (artifact.isSnapshot()) {
            ArtifactRepositoryMetadata metadata = new ArtifactRepositoryMetadata(artifact) {
                // maven is weird - i have yet to find a better solution.

                @Override
                public boolean storedInArtifactVersionDirectory() {
                    return true;
                }

                @Override
                public String getBaseVersion() {
                    return artifact.getBaseVersion();
                }
            };

            // try to load maven-metadata.xml in case we need to use a different version for snapshots
            URL metaUrl = new URL(repository.getUrl() + '/' + repository.pathOfRemoteRepositoryMetadata(metadata));

            Metadata loadedMetadata;
            try (InputStream input = openStream(metaUrl)) {
                loadedMetadata = new MetadataXpp3Reader().read(input, true);
            } catch (IOException e) {
                // could not find metadata
                loadedMetadata = null;
            } catch (XmlPullParserException e) {
                throw new MojoExecutionException("Failed to parse metadata", e);
            }

            if (loadedMetadata != null) {
                Snapshot snapshot = loadedMetadata.getVersioning().getSnapshot();

                String versionWithoutSuffix = artifact.getVersion()
                        .substring(0, artifact.getBaseVersion().lastIndexOf('-'));
                artifactPath = getArtifactPath(artifact,
                                               versionWithoutSuffix + '-' + snapshot.getTimestamp() + '-' +
                                               snapshot.getBuildNumber());
            }
        }

        URL url = new URL(repository.getUrl() + '/' + artifactPath);
        try (InputStream input = openStream(url)) {
            getLog().info("Getting checksum for " + artifact);

            MessageDigest digest = MessageDigest.getInstance("SHA-512");
            byte[] buf = new byte[4096];
            int len;
            while ((len = input.read(buf)) >= 0) {
                digest.update(buf, 0, len);
            }

            Dependency dependency = new Dependency();
            dependency.setUrl(url);
            dependency.setSha512sum(digest.digest());
            return dependency;
        } catch (IOException ignored) {
            // not in this repo
            return null;
        }
    }
