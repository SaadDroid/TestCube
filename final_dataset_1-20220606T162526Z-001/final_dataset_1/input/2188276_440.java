public PluginSessionCallback sessionStarted(ISession session)
	{
		// Adds the view and procedure script actions if the session is DB2.
		addTreeNodeMenuActionsForDB2(session);

		// Register a custom ISQLExecutionListener implementation that simply prints all SQL being executed to
		// the message panel.
		IMessageHandler messageHandler = session.getApplication().getMessageHandler();
		ExampleSqlExecutionListener sqlExecutionListener = new ExampleSqlExecutionListener(messageHandler);
		session.getSessionSheet().getSQLPaneAPI().addSQLExecutionListener(sqlExecutionListener);

		// We will override the default behavior of formatting exception messages that SQuirreL provides for 
		// this session with our own.  If this was a real plugin implementation, care would need to be taken 
		// that the custom formatter is only applied to database vendor sessions that this plugin was written 
		// for.  SQuirreL doesn't support registering multiple exception formatters for a single session.  The
		// last one to register overrides all former registrations and results in a log warning message.
		session.setExceptionFormatter(new ExampleExceptionFormatter());
		
		return new PluginSessionCallbackAdaptor(this);
	}
