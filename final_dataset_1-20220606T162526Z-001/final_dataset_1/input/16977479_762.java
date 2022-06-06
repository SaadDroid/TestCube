public void setExternalLinks(List<String> externalLinks) {
        externalSchemaLinks = new LinkedList<>();
        for (String s : externalLinks) {
            try {
                String href = s;
                if (href.startsWith("classpath:")) {
                    int index = href.lastIndexOf('/');
                    href = index == -1 ? href.substring(9) : href.substring(index + 1);
                    docLocationMap.put(href, s);
                }
                externalSchemaLinks.add(URI.create(href));
            } catch (Exception ex) {
                LOG.warning("Not a valid URI : " + s);
                externalSchemaLinks = null;
                break;
            }
        }
    }
