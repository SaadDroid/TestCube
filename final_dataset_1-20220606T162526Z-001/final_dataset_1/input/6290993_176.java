public static <T> WritableType<Collection<T>, GenericArrayWritable> collections(PType<T> ptype) {
    WritableType<T, ?> wt = (WritableType<T, ?>) ptype;
    return new WritableType(Collection.class, GenericArrayWritable.class,
        new ArrayCollectionMapFn(wt.getSerializationClass(), wt.getInputMapFn()),
        new CollectionArrayMapFn(wt.getOutputMapFn()), ptype);
  }
