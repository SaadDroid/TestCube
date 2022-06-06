<R> R wrapSqlException(SqlAction<R> action) {
        try {
            return action.perform();
        } catch (SQLException sqlException) {
            throw excTranslator.translate("StreamResultSetExtractor", sql, sqlException);
        }
    }
