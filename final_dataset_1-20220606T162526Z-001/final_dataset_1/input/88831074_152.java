@SuppressWarnings("unchecked")
    List<Substitutable> getFileElements(FileEntry fileEntry)  {
        // TODO: Name attribute of file entry can not contain comma separated files.
        String pathEntries[] = fileEntry.getName().split(",");
        List<Substitutable> substituables = null;
        List<File> retrievedFiles  = null;
        for(String pathEntry : pathEntries) {
            String isRegex = fileEntry.getRegex();
            if(Boolean.getBoolean(isRegex) || "yes".equalsIgnoreCase(isRegex)) {
                File file = new File(pathEntry);
                File parentDir = file.getParentFile();
                if(parentDir == null || !parentDir.exists()) {
                    continue;
                }
                retrievedFiles = new ArrayList<File>();
                String expression = file.getName();
                String[] fileList = parentDir.list();
                Pattern pattern = Pattern.compile(expression);
                if(fileList != null) {
                    for (String fileName : fileList) {
                        Matcher matcher = pattern.matcher(fileName);
                        if (matcher.matches()) {
                            File matchingFile = new File(parentDir, fileName);
                            if (matchingFile.exists() && matchingFile.canRead() && matchingFile.canWrite()) {
                                retrievedFiles.add(matchingFile);
                            } else {
                                if (_logger.isLoggable(Level.FINER)) {
                                    _logger.log(Level.FINER, _strings.get("skipFileFromSubstitution", matchingFile.getAbsolutePath()));
                                }
                            }
                        }
                    }
                }
            }
            else {
                FileLister fileLocator = new FileLister();
                retrievedFiles = fileLocator.getFiles(fileEntry.getName());
            }
            if (retrievedFiles.isEmpty()) {
            	if (_logger.isLoggable(Level.FINER)) {
            		_logger.log(Level.FINER, _strings.get("noMatchedFile", pathEntry));
            	}
                continue;
            }
            if (substituables == null) {
                substituables = new ArrayList<Substitutable>(retrievedFiles.size());
            }
            for (File retrievedFile : retrievedFiles) {
                if (retrievedFile.exists()) {
                    try {
                        FileSubstitutionHandler substituable = retrievedFile.length() > SubstitutionFileUtil.getInMemorySubstitutionFileSizeInBytes() ?
                                new LargeFileSubstitutionHandler(retrievedFile) : new SmallFileSubstitutionHandler(retrievedFile);
                                substituables.add(substituable);
                    } catch (FileNotFoundException e) {
                    	LogHelper.log(_logger, Level.WARNING, SLogger.INVALID_FILE_LOCATION, e, retrievedFile);
                    }
                }
            }
        }
        return substituables == null ? Collections.EMPTY_LIST: substituables;
    }
