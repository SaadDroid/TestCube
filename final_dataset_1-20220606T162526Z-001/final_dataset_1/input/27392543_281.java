public synchronized static RecordAccessor getRecordAccessorForObject(Object obj) {
    for (RecordAccessorProvider p: recordAccessorProviders) {
      RecordAccessor accessor = p.recordAccessorForObject(obj);
      if (accessor != null) {
        return accessor;
      }
    }

    throw new IllegalArgumentException("Can't build accessor for object " + obj.toString() + "!");
  }
