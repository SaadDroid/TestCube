@Override
    public List<Integer> getPids() {
        int pidMax = readPidMax();
        BiPredicate<Path, BasicFileAttributes> filter = new ProcPathFilter(pidMax);

        try {
            // assumption: the used filter removes any non-integer files from the stream
            return Files.find(procRoot, 1, filter)
                .map(path -> Integer.parseUnsignedInt(path.getFileName().toString()))
                .collect(Collectors.toList());
        } catch (IOException ex) {
            throw new ProcessEnumerationException("An error occurred while enumerating PIDs", ex);
        }
    }
