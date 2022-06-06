@Override
	public String statementExecuting(String sql)
	{
		_messageHandler.showMessage("statementExecuting: "+sql);
		
		// We don't modify the SQL in this example.  in addition to modifying it, we could veto it's execution 
		// by returning null.
		return sql;
	}
