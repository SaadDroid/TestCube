@Override
	public LoggingEvent read(XMLStreamReader reader)
		throws XMLStreamException
	{

		int type = reader.getEventType();
		if(XMLStreamConstants.START_DOCUMENT == type)
		{
			do
			{
				reader.next();
				type = reader.getEventType();
			}
			while(type != XMLStreamConstants.START_ELEMENT || !RECORD_NODE.equals(reader.getLocalName()));
		}
		if(XMLStreamConstants.START_ELEMENT == type && RECORD_NODE.equals(reader.getLocalName()))
		{
			reader.nextTag();

			LoggingEvent result = new LoggingEvent();

			String dateStr = StaxUtilities.readSimpleTextNodeIfAvailable(reader, null, DATE_NODE);
			String millisStr = StaxUtilities.readSimpleTextNodeIfAvailable(reader, null, MILLIS_NODE);
			Long timeStamp = null;
			if(millisStr != null)
			{
				try
				{
					timeStamp = Long.parseLong(millisStr);
				}
				catch(NumberFormatException ex)
				{
					// ignore
				}
			}
			if(timeStamp == null && dateStr != null)
			{
				// TODO: parse from string
				if(logger.isInfoEnabled()) logger.info("Parsing date hasn't been implemented since millis is mandatory in Schema."); // NOPMD
			}
			result.setTimeStamp(timeStamp);

			String sequenceStr = StaxUtilities.readSimpleTextNodeIfAvailable(reader, null, SEQUENCE_NODE);
			try
			{
				result.setSequenceNumber(Long.parseLong(sequenceStr));
			}
			catch(NumberFormatException ex)
			{
				// ignore
			}

			String loggerStr = StaxUtilities.readSimpleTextNodeIfAvailable(reader, null, LOGGER_NODE);
			result.setLogger(loggerStr);

			result.setLevel(resolveLevel(StaxUtilities.readSimpleTextNodeIfAvailable(reader, null, LEVEL_NODE)));

			String classStr = StaxUtilities.readSimpleTextNodeIfAvailable(reader, null, CLASS_NODE);
			String methodStr = StaxUtilities.readSimpleTextNodeIfAvailable(reader, null, METHOD_NODE);
			if(classStr != null || methodStr != null)
			{
				ExtendedStackTraceElement[] callStack = {
						new ExtendedStackTraceElement(classStr, methodStr, null, -1),
					};
				result.setCallStack(callStack);
			}
			String threadStr = StaxUtilities.readSimpleTextNodeIfAvailable(reader, null, THREAD_NODE);
			if(threadStr != null)
			{
				try
				{
					long threadId = Long.parseLong(threadStr);
					result.setThreadInfo(new ThreadInfo(threadId, null, null, null));
				}
				catch(NumberFormatException ex)
				{
					// ignore
				}

			}
			String messageStr = StaxUtilities.readSimpleTextNodeIfAvailable(reader, null, MESSAGE_NODE);
			if(messageStr != null)
			{
				result.setMessage(new Message(messageStr));
			}
			// key?, catalog? param*
			{
				String keyStr = StaxUtilities.readSimpleTextNodeIfAvailable(reader, null, KEY_NODE);
				String catalogStr = StaxUtilities.readSimpleTextNodeIfAvailable(reader, null, CATALOG_NODE);
				List<String> paramList = new ArrayList<>();
				for(;;)
				{
					String paramStr = StaxUtilities.readSimpleTextNodeIfAvailable(reader, null, PARAM_NODE);
					if(paramStr == null)
					{
						break;
					}
					paramList.add(paramStr);
				}
				if(keyStr != null || catalogStr != null || !paramList.isEmpty())
				{
					if(logger.isInfoEnabled()) logger.info("Ignoring the following message info: key={}, catalog={}, params={}", keyStr, catalogStr, paramList); // NOPMD
				}
			}
			result.setThrowable(readThrowableInfo(reader));
			reader.require(XMLStreamConstants.END_ELEMENT, null, RECORD_NODE);
			for(;;)
			{
				reader.next();
				type = reader.getEventType();
				if(type == XMLStreamConstants.END_DOCUMENT)
				{
					break;
				}
				if(type == XMLStreamConstants.START_ELEMENT)
				{
					break;
				}
			}
			return result;
		}
		return null;
	}
