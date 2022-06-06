public ReleaseEntity findExactOrClosestPastRelease(SortedSet<ReleaseEntity> releases, Date currentDate) {
        return findMostRelevantRelease(releases, currentDate, false);
    }
