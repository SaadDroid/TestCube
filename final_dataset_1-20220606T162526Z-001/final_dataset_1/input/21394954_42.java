public static List<ContentRepositoryElement> listFiles(final Path rootPath, Path tempDir, final ContentFilter filter) throws IOException {
        List<ContentRepositoryElement> result = new ArrayList<>();
        if (Files.exists(rootPath)) {
            if(isArchive(rootPath)) {
                return listZipContent(rootPath, filter);
            }
            Files.walkFileTree(rootPath, new FileVisitor<Path>() {
                @Override
                public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                    return FileVisitResult.CONTINUE;
                }

                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                    if (filter.acceptFile(rootPath, file)) {
                        result.add(ContentRepositoryElement.createFile(formatPath(rootPath.relativize(file)), Files.size(file)));
                    }
                    return FileVisitResult.CONTINUE;
                }

                @Override
                public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
                    return FileVisitResult.CONTINUE;
                }

                @Override
                public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
                    if (filter.acceptDirectory(rootPath, dir)) {
                        String directoryPath = formatDirectoryPath(rootPath.relativize(dir));
                        if(! "/".equals(directoryPath)) {
                            result.add(ContentRepositoryElement.createFolder(directoryPath));
                        }
                    }
                    return FileVisitResult.CONTINUE;
                }

                private String formatDirectoryPath(Path path) {
                    return formatPath(path) + '/';
                }

                private String formatPath(Path path) {
                    return path.toString().replace(File.separatorChar, '/');
                }
            });
        } else {
            Path file = getFile(rootPath);
            if(isArchive(file)) {
                Path relativePath = file.relativize(rootPath);
                Path target = createTempDirectory(tempDir, "unarchive");
                unzip(file, target);
                return listFiles(target.resolve(relativePath), tempDir, filter);
            } else {
                throw new FileNotFoundException(rootPath.toString());
            }
        }
        return result;
    }
