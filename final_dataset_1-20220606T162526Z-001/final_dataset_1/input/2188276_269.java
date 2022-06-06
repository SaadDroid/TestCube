public IWhereClausePart getWhereClauseValue(Object value, ISQLDatabaseMetaData md) {
      if (value == null || value.toString() == null || value.toString().length() == 0) {
         return new IsNullWhereClausePart(_colDef);
      } else {
         // since we cannot do exact matches on floating point
         // numbers, we cannot use this field in the WHERE clause.
         return new EmptyWhereClausePart();
      }
   }
