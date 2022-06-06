public boolean loadSchemaIndependentMetaData(SQLAliasSchemaProperties schemaPropsCacheIsBasedOn)
   {
      if(null == schemaPropsCacheIsBasedOn)
      {
         return true;
      }

      return !(schemaPropsCacheIsBasedOn._cacheSchemaIndependentMetaData && _cacheSchemaIndependentMetaData);

   }
