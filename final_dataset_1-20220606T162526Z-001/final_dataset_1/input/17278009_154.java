public static void forEachFile(File directory, FileVisitor visitor) {
        Deque<File> directories = new LinkedList<File>();
        directories.push(directory);

        while (!directories.isEmpty()) {
            File dir = directories.pop();
            File[] files = dir.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isDirectory()) {
                        directories.push(file);
                    } else {
                        visitor.visit(file);
                    }
                }
            }
        }
    }
