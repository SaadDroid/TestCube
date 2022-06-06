public List<ResourceEntity> getAllMinorReleasesFollowingRelease(Set<ResourceEntity> allReleaseResources, ReleaseEntity release) {
        List<ResourceEntity> followingMinorRelease = new ArrayList<>();

        List<ResourceEntity> allReleaseResourcesOrderedByRelease = new ArrayList<>(allReleaseResources);
        Collections.sort(allReleaseResourcesOrderedByRelease, resourceReleaseComparator);

        boolean isMinorReleaseToAdd = false;
        for (ResourceEntity resource : allReleaseResourcesOrderedByRelease) {
            if (isMinorReleaseToAdd) {
                if (!resource.getRelease().isMainRelease()) {
                    followingMinorRelease.add(resource);
                } else {
                    return followingMinorRelease;
                }
            }

            if (resource.getRelease().equals(release)) {
                // start adding releases until next
                isMinorReleaseToAdd = true;
            }
        }

        return followingMinorRelease;
    }
