@Override
	public Long call()
		throws Exception
	{
		if(!inputFile.isFile())
		{
			throw new IllegalArgumentException("'" + inputFile.getAbsolutePath() + "' is not a file!");
		}
		if(!inputFile.canRead())
		{
			throw new IllegalArgumentException("'" + inputFile.getAbsolutePath() + "' is not a readable!");
		}
		long fileSize = inputFile.length();
		setNumberOfSteps(fileSize);
		InputStream fis = Files.newInputStream(inputFile.toPath());
		CountingInputStream cis = new CountingInputStream(fis);

		String fileName=inputFile.getName().toLowerCase(Locale.US);
		BufferedReader br;
		if(fileName.endsWith(".gz"))
		{
			br = new BufferedReader(new InputStreamReader(new GZIPInputStream(cis), StandardCharsets.UTF_8));
		}
		else
		{
			br = new BufferedReader(new InputStreamReader(cis, StandardCharsets.UTF_8));
		}

		StringBuilder builder = new StringBuilder();

		result = 0;
		for(;;)
		{
			String line = br.readLine();
			setCurrentStep(cis.getByteCount());
			if(line == null)
			{
				evaluate(builder.toString());
				break;
			}
			for(;;)
			{
				int closeIndex = line.indexOf(CLOSING_LOG4J_EVENT_TAG);
				if(closeIndex >= 0)
				{
					int endIndex = closeIndex + CLOSING_LOG4J_EVENT_TAG.length();
					builder.append(line.subSequence(0, endIndex));
					evaluate(builder.toString());
					builder.setLength(0);
					line = line.substring(endIndex);
				}
				else
				{
					builder.append(line).append('\n');
					break;
				}
			}
		}
		return result;
	}
