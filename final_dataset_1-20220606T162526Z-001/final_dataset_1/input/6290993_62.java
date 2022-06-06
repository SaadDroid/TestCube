private static <S> FormatBundle getBundle(AvroType<S> ptype, AvroMode mode) {
    FormatBundle bundle = FormatBundle.forInput(AvroInputFormat.class)
          .set(AvroJob.INPUT_IS_REFLECT, String.valueOf(ptype.hasReflect()))
          .set(AvroJob.INPUT_SCHEMA, ptype.getSchema().toString())
          .set(Avros.REFLECT_DATA_FACTORY_CLASS, Avros.REFLECT_DATA_FACTORY.getClass().getName())
          .set(RuntimeParameters.DISABLE_COMBINE_FILE, Boolean.FALSE.toString());
    mode.configure(bundle);
    return bundle;
  }
