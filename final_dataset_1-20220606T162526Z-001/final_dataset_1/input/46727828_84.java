@Override
  public void configure(Configuration conf) {
    dateFormat = conf.getString(DATE_FORMAT);
    dateFields = new ArrayList<>();
    conf.getList(DATE_FIELD).forEach(x -> dateFields.add(x.toString()));

    _updateIndexField = conf.getBoolean(UPDATE_INDEX_FIELD, false);

    Validate.notEmpty(dateFields);
    Validate.notBlank(dateFormat);
  }
