public String build()
    {
        Validate.notNull(databaseName, "databaseName can not be null.");
        Validate.notEmpty(databaseName, "databaseName can not be empty.");
        Validate.notNull(tableName, "tableName can not be null.");
        Validate.notEmpty(tableName, "tableName can not be empty.");

        query.add(TEMPLATE_FIELD, this);
        return query.render();
    }
