@Nonnull
    public static List<MavenArtifact> isSameCause(MavenDependencyCause newMavenCause, Cause oldMavenCause) {
        if (!(oldMavenCause instanceof MavenDependencyCause)) {
            return Collections.emptyList();
        }

        List<MavenArtifact> newCauseArtifacts = Preconditions.checkNotNull(newMavenCause.getMavenArtifacts(), "newMavenCause.mavenArtifacts should not be null");
        List<MavenArtifact> oldCauseArtifacts =  Preconditions.checkNotNull(((MavenDependencyCause) oldMavenCause).getMavenArtifacts(), "oldMavenCause.mavenArtifacts should not be null");

        List<MavenArtifact> matchingArtifacts = new ArrayList<>();
        for (MavenArtifact newCauseArtifact : newCauseArtifacts) {
            if (newCauseArtifact.isSnapshot() && newCauseArtifact.getVersion().contains("SNAPSHOT")) {
                // snapshot without exact version (aka base version), cannot search for same cause
            } else {
                for (MavenArtifact oldCauseArtifact : oldCauseArtifacts) {
                    if (Objects.equals(newCauseArtifact.getGroupId(), oldCauseArtifact.getGroupId()) &&
                            Objects.equals(newCauseArtifact.getArtifactId(), oldCauseArtifact.getArtifactId()) &&
                            Objects.equals(newCauseArtifact.getVersion(), oldCauseArtifact.getVersion()) &&
                            Objects.equals(newCauseArtifact.getBaseVersion(), oldCauseArtifact.getBaseVersion()) &&
                            Objects.equals(newCauseArtifact.getClassifier(), oldCauseArtifact.getClassifier()) &&
                            Objects.equals(newCauseArtifact.getType(), oldCauseArtifact.getType())) {
                        matchingArtifacts.add(newCauseArtifact);
                    }
                }
            }
        }

        return matchingArtifacts;
    }
