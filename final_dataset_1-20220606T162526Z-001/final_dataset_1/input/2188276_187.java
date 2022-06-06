public void copyDir(FileWrapper fromDir, FileWrapper toDir) throws FileNotFoundException, IOException
	{
		verifyDirectory(fromDir, toDir);
		FileWrapper[] files = fromDir.listFiles();
		copyFiles(Arrays.asList(files), toDir);
	}
