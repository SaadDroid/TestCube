public Time getTime(int columnIdx) throws SQLException
	{
		final Time results = _rs.getTime(columnIdx);
		_wasNull = results == null;
		return results;
	}
