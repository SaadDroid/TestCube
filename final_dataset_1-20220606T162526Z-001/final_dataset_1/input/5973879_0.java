@Override
    public void beforeSave(StorageItem storageItem, StorageItemUploadPart part) throws IOException {

        if (part == null) {
            return;
        }

        String fileContentType = part.getContentType();

        if (fileContentType == null) {
            return;
        }

        String groupsPattern = Settings.get(String.class, "cms/tool/fileContentTypeGroups");
        Set<String> contentTypeGroups = new SparseSet(ObjectUtils.isBlank(groupsPattern) ? "+/" : groupsPattern);

        Preconditions.checkState(contentTypeGroups.contains(fileContentType),
                "Invalid content type " + fileContentType + ". Must match the pattern " + contentTypeGroups + ".");

        // Disallow HTML disguising as other content types per:
        // http://www.adambarth.com/papers/2009/barth-caballero-song.pdf
        if (!contentTypeGroups.contains("text/html")) {

            if (part.getFile() == null) {
                return;
            }

            try (InputStream input = new FileInputStream(part.getFile())) {
                byte[] buffer = new byte[1024];
                String data = new String(buffer, 0, input.read(buffer)).toLowerCase(Locale.ENGLISH);
                String ptr = data.trim();

                if (ptr.startsWith("<!")
                        || ptr.startsWith("<?")
                        || data.startsWith("<html")
                        || data.startsWith("<script")
                        || data.startsWith("<title")
                        || data.startsWith("<body")
                        || data.startsWith("<head")
                        || data.startsWith("<plaintext")
                        || data.startsWith("<table")
                        || data.startsWith("<img")
                        || data.startsWith("<pre")
                        || data.startsWith("text/html")
                        || data.startsWith("<a")
                        || ptr.startsWith("<frameset")
                        || ptr.startsWith("<iframe")
                        || ptr.startsWith("<link")
                        || ptr.startsWith("<base")
                        || ptr.startsWith("<style")
                        || ptr.startsWith("<div")
                        || ptr.startsWith("<p")
                        || ptr.startsWith("<font")
                        || ptr.startsWith("<applet")
                        || ptr.startsWith("<meta")
                        || ptr.startsWith("<center")
                        || ptr.startsWith("<form")
                        || ptr.startsWith("<isindex")
                        || ptr.startsWith("<h1")
                        || ptr.startsWith("<h2")
                        || ptr.startsWith("<h3")
                        || ptr.startsWith("<h4")
                        || ptr.startsWith("<h5")
                        || ptr.startsWith("<h6")
                        || ptr.startsWith("<b")
                        || ptr.startsWith("<br")) {
                    throw new IOException("Can't upload [" + fileContentType + "] file disguising as HTML!");
                }
            }
        }
    }
