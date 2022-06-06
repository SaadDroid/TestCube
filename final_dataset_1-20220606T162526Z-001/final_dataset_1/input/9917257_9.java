@ServiceProperty(category = "connection")
	public String getJdbcUrl() {
		return jdbcUrl == null ? buildJdbcUrl() : jdbcUrl;
	}
