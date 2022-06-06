public void setScriptToTokenize(String script)
	{
		super.setScriptToTokenize(script);

		removeSqlPlusSetCommands();

		// Since it is likely to have "/" on it's own line, and it is key to
		// letting us know that proceeding statements form a multi-statement
		// procedure or function, it deserves it's own place in the _queries
		// arraylist. If it is followed by other procedure or function creation
		// blocks, we may fail to detect that, so this just goes through the
		// list and breaks apart statements on newline so that this cannot
		// happen.
		breakApartNewLines();

		// Oracle allows statement separators in PL/SQL blocks. The process
		// of tokenizing above renders these procedure blocks as separate
		// statements, which is invalid for Oracle. Since "/" is the way
		// in SQL-Plus to denote the end of a procedure or function, we
		// re-assemble any create procedure/function/trigger statements that we
		// find. This should be done before expanding file includes. Otherwise,
		// any create sql found in files will already be joined, causing this to
		// find create SQL without matching "/". The process of
		// expanding 'file includes' already joins the sql fragments that it
		// finds.
		joinFragments(procPattern, false);
		joinFragments(funcPattern, false);
		joinFragments(triggerPattern, false);
		joinFragments(packagePattern, false);
		joinFragments(declPattern, false);
		joinFragments(beginPattern, true);

		expandFileIncludes(ORACLE_SCRIPT_INCLUDE_PREFIX);

		removeRemainingSlashes();

		_queryIterator = _queries.iterator();
	}
