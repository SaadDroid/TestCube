static Map<String, LocalResource> setupTezJarsLocalResources(
      TezConfiguration conf, Credentials credentials)
      throws IOException {
    Preconditions.checkNotNull(credentials, "A non-null credentials object should be specified");
    Map<String, LocalResource> tezJarResources = new HashMap<String, LocalResource>();

    if (conf.getBoolean(TezConfiguration.TEZ_IGNORE_LIB_URIS, false)){
      LOG.info("Ignoring '" + TezConfiguration.TEZ_LIB_URIS + "' since  '" + 
            TezConfiguration.TEZ_IGNORE_LIB_URIS + "' is set to true");
    } else {
      // Add tez jars to local resource
      String[] tezJarUris = conf.getStrings(TezConfiguration.TEZ_LIB_URIS);
        
      if (tezJarUris == null || tezJarUris.length == 0) {
        throw new TezUncheckedException("Invalid configuration of tez jars"
            + ", " + TezConfiguration.TEZ_LIB_URIS
            + " is not defined in the configurartion");
      }
     
      List<Path> tezJarPaths = Lists.newArrayListWithCapacity(tezJarUris.length);

      for (String tezJarUri : tezJarUris) {
        URI uri;
        try {
          uri = new URI(tezJarUri.trim());
        } catch (URISyntaxException e) {
          String message = "Invalid URI defined in configuration for"
              + " location of TEZ jars. providedURI=" + tezJarUri;
          LOG.error(message);
          throw new TezUncheckedException(message, e);
        }
        if (!uri.isAbsolute()) {
          String message = "Non-absolute URI defined in configuration for"
              + " location of TEZ jars. providedURI=" + tezJarUri;
          LOG.error(message);
          throw new TezUncheckedException(message);
        }
        Path p = new Path(uri);
        FileSystem pathfs = p.getFileSystem(conf);
        p = pathfs.makeQualified(p);
        tezJarPaths.add(p);
        RemoteIterator<LocatedFileStatus> iter = pathfs.listFiles(p, false);
        while (iter.hasNext()) {
          LocatedFileStatus fStatus = iter.next();
          String rsrcName = fStatus.getPath().getName();
          // FIXME currently not checking for duplicates due to quirks
          // in assembly generation
          if (tezJarResources.containsKey(rsrcName)) {
            String message = "Duplicate resource found"
                + ", resourceName=" + rsrcName
                + ", existingPath=" +
                tezJarResources.get(rsrcName).getResource().toString()
                + ", newPath=" + fStatus.getPath();
            LOG.warn(message);
            // throw new TezUncheckedException(message);
          }
          tezJarResources.put(rsrcName,
              LocalResource.newInstance(
                  ConverterUtils.getYarnUrlFromPath(fStatus.getPath()),
                  LocalResourceType.FILE,
                  LocalResourceVisibility.PUBLIC,
                  fStatus.getLen(),
                  fStatus.getModificationTime()));
        }
      }
      
      if (tezJarResources.isEmpty()) {
        throw new TezUncheckedException(
            "No files found in locations specified in "
                + TezConfiguration.TEZ_LIB_URIS + " . Locations: "
                + StringUtils.join(tezJarUris, ','));
      } else {
        // Obtain credentials.
        TokenCache.obtainTokensForFileSystems(credentials,
            tezJarPaths.toArray(new Path[tezJarPaths.size()]), conf);
      }
    }
   
    return tezJarResources;
  }
