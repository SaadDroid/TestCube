@Override
	public PreparedStatement prepareStatement(String sql) throws SQLException {
		try {
			return connection.prepareStatement(sql);
		} catch (SQLException sqlEx) {
			recover(sqlEx);
			return connection.prepareStatement(sql);
		}
	}
