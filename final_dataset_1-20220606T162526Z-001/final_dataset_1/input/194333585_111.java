@Override
  public ReturnCode filterKeyValue(Cell next) {
    // we marked ourselves done, but the END_ROW_KEY didn't manage to seek to the very last key
    if (this.done) {
      return ReturnCode.SKIP;
    }

    KeyValue nextKV = KeyValueUtil.ensureKeyValue(next);
    switch (KeyValue.Type.codeToType(next.getTypeByte())) {
    /*
     * DeleteFamily will always sort first because those KVs (we assume) don't have qualifiers (or
     * rather are null). Therefore, we have to keep a hold of all the delete families until we get
     * to a Put entry that is covered by that delete (in which case, we are done with the family).
     */
    case DeleteFamily:
      // track the family to delete. If we are updating the delete, that means we have passed all
      // kvs in the last column, so we can safely ignore the last deleteFamily, and just use this
      // one. In fact, it means that all the previous deletes can be ignored because the family must
      // not match anymore.
      // We could potentially have multiple deleteFamily for the same row and family
      // (e.g. upsert row+family, delete it, upsert again, delete again),
      // in which case we keep the first one since its timestamp dominates
      if (coveringDelete.deleteFamily == null || !CellUtil.matchingFamily(coveringDelete.deleteFamily, nextKV)) {
          this.coveringDelete.reset();
          this.coveringDelete.deleteFamily = nextKV;
      }
      return ReturnCode.SKIP;
    case DeleteColumn:
      // similar to deleteFamily, all the newer deletes/puts would have been seen at this point, so
      // we can safely replace the more recent delete column with the more recent one
      this.coveringDelete.pointDelete = null;
      this.coveringDelete.deleteColumn = nextKV;
      return ReturnCode.SKIP;
    case Delete:
      // we are just deleting the single column value at this point.
      // therefore we just skip this entry and go onto the next one. The only caveat is that
      // we should still cover the next entry if this delete applies to the next entry, so we
      // have to keep around a reference to the KV to compare against the next valid entry
      this.coveringDelete.pointDelete = nextKV;
      return ReturnCode.SKIP;
    default:
      // no covering deletes
      if (coveringDelete.empty()) {
        return ReturnCode.INCLUDE;
      }

      if (coveringDelete.matchesFamily(nextKV)) {
        this.currentHint = familyHint;
        return ReturnCode.SEEK_NEXT_USING_HINT;
      }

      if (coveringDelete.matchesColumn(nextKV)) {
        // hint to the next column
        this.currentHint = columnHint;
        return ReturnCode.SEEK_NEXT_USING_HINT;
      }

      if (coveringDelete.matchesPoint(nextKV)) {
        return ReturnCode.SKIP;
      }

    }

    // none of the deletes matches, we are done
    return ReturnCode.INCLUDE;
  }
