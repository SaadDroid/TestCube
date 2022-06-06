public boolean isOverlappingInput(WorkDetails o) {
    return _snapshotId.equals(o._snapshotId)
        || _snapshotId.equals(o._referenceSnapshotId)
        || _isDifferential
            && (_referenceSnapshotId.equals(o._snapshotId)
                || _referenceSnapshotId.equals(o._referenceSnapshotId));
  }
