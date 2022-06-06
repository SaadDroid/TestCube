public static ResourceBasedJobTemplate forResourcePath(String path)
      throws SpecNotFoundException, TemplateException, IOException, URISyntaxException {
    return forResourcePath(path, new PackagedTemplatesJobCatalogDecorator());
  }
