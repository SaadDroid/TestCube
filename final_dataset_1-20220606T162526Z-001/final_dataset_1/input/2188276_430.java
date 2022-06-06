public String format(Throwable t) throws Exception
	{
		Utilities.checkNull("format", "t", t);

		StringBuilder builder = new StringBuilder();
		// DB2Sqlca sqlca = ((DB2Diagnosable) t).getSqlca();
		Method getSqlca = t.getClass().getMethod(METHOD_GET_SQLCA, (Class[]) null);
		Object sqlca = getSqlca.invoke(t, (Object[]) null);

		// String msg = sqlca.getMessage();
		Method getMessage = sqlca.getClass().getMethod(METHOD_GET_MESSAGE, (Class[]) null);
		String msg = getMessage.invoke(sqlca, (Object[]) null).toString();

		// int sqlCode = sqlca.getSqlCode();
		Method getSqlCode = sqlca.getClass().getMethod(METHOD_GET_SQL_CODE, (Class[]) null);
		int sqlCode = (Integer) getSqlCode.invoke(sqlca, (Object[]) null);

		// int sqlstate = sqlca.getSqlState();
		Method getSqlState = sqlca.getClass().getMethod(METHOD_GET_SQL_STATE, (Class[]) null);
		String sqlState = getSqlState.invoke(sqlca, (Object[]) null).toString();

		builder.append(msg).append(" SQL Code: ").append(sqlCode).append(", SQL State: ").append(sqlState);
		return builder.toString();
	}
