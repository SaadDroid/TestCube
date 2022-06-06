@Override
	public DataAccessException translateExceptionIfPossible(RuntimeException ex) {
		if (!(ex instanceof JdbcException)) {
			// Fallback to other translators if not JdbcException
			return null;
		}

		if (ex instanceof OptimisticLockException) {
			return new OptimisticLockingFailureException(ex.getMessage(), ex);
		} else if (ex instanceof UniqueConstraintException) {
			return new DuplicateKeyException(ex.getMessage(), ex);
		} else if (ex instanceof NonUniqueResultException
				|| ex instanceof NonSingleColumnException) {
			return new IncorrectResultSizeDataAccessException(ex.getMessage(), 1, ex);
		} else if (ex instanceof NoResultException) {
			return new EmptyResultDataAccessException(ex.getMessage(), 1, ex);
		} else if (ex instanceof UnknownColumnException
				|| ex instanceof ResultMappingException) {
			return new TypeMismatchDataAccessException(ex.getMessage(), ex);
		}

		if (ex.getCause() instanceof SQLException) {
			SQLException e = (SQLException) ex.getCause();
			String sql = null;
			if (ex instanceof SqlExecutionException) {
				sql = ((SqlExecutionException) ex).getRawSql();
			}
			return translator.translate(ex.getMessage(), sql, e);
		}

		return new UncategorizedDataAccessException(ex.getMessage(), ex) {
		};
	}
