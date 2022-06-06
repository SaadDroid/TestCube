public static AccumuloConfiguration getAccumuloConfiguration(Criteria criteria, CognitionConfiguration cognition) {
    AccumuloConfiguration accumulo = cognition.getAccumuloConfiguration();
    accumulo.setTableName(criteria.getAccumuloTable());
    accumulo.setRanges(AccumuloUtils.getRanges(criteria.getDateStart(), criteria.getDateEnd(), criteria.getSchema().getSource()));
    accumulo.setAuthorizations(criteria.getSchema().getAuthorizations());

    return accumulo;
  }
