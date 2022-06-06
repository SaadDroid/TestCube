public boolean evaluate(Object... objects) throws SQLException{
		return evaluate(Lists.newArrayList(objects), null);
	}
