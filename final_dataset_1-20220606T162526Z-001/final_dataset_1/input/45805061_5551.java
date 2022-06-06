@Override
  public <S extends NamedSnapshot> S getSingle(Class<S> type,
                                               String snapshotName,
                                               VersionCorrection versionCorrection) {

    // Try to find an exact match using the name and type first. If this doesn't work
    // (perhaps as the type searched for is a superclass of the type held), we search
    // again by name only and check the type after.
    // TODO - review usage patterns, do we normally hit or miss using type. If names are generally unique searching by type is potentially redundant
    TypedSnapshotSearcher<S> searcher =
        new TypedSnapshotSearcher<>(getMaster(), type, snapshotName, versionCorrection);
    return searcher.search();
  }
