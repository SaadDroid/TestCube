@Override
	public Connection getConnection() throws SQLException {
		if (successfullyConnected) return super.getConnection();

		synchronized (this) {
			Connection connection;

			try {
				connection = super.getConnection();
				successfullyConnected = true;
			} catch (SQLException e) {
				logger.info("Database connection failed. Trying again with url-decoded jdbc url");
				DataSource targetDataSource = getTargetDataSource();
				if (targetDataSource == null) throw new IllegalStateException("target DataSource should never be null");
				BeanWrapper dataSourceWrapper = new BeanWrapperImpl(targetDataSource);
				String decodedJdbcUrl = decode((String) dataSourceWrapper.getPropertyValue(urlPropertyName));
				DataSource urlDecodedConnectionTestDataSource = connectionTestDataSourceFactory.apply(decodedJdbcUrl);
				urlDecodedConnectionTestDataSource.getConnection();

				logger.info("Connection test successful. Continuing with url-decoded jdbc url");
				dataSourceWrapper.setPropertyValue(urlPropertyName, decodedJdbcUrl);
				connection = super.getConnection();
				successfullyConnected = true;
			}

			return connection;
		}
	}
