public static List<String> readLines(File file) throws Exception {
        if (!exists(file)) {
            return Collections.emptyList();
        }
        return Files.readAllLines(file.toPath());
    }
