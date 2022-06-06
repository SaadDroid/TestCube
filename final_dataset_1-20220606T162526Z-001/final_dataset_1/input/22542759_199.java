@Override
  public void run() throws Exception {
    // Because the logging framework supports usage of addition jars to host appender classes,
    // for validations, we need to construct a new classloader using all system jars plus the configured
    // additional log library jars.
    // A new classloader is needed because the logback doesn't support context classloader and requires the
    // LoggerContext class needs to be loaded from the same classloader as all appender classes.
    // We need to use reflection to load the LogPipelineLoader class and call validate on it

    // Collects all URLS used by the CDAP system classloader
    List<URL> urls = ClassLoaders.getClassLoaderURLs(getClass().getClassLoader(), new ArrayList<URL>());
    for (File libJar : LoggingUtil.getExtensionJars(cConf)) {
      urls.add(libJar.toURI().toURL());
    }

    // Serialize the cConf to a String. This is needed because the cConf field is
    // loaded from the CDAP system classloader and cannot be passed directly to the
    // LogPipelineLoader class that loaded from the new ClassLoader constructed above.
    StringWriter writer = new StringWriter();
    this.cConf.writeXml(writer);

    // Create a new classloader and run the following code using reflection
    //
    // CConfiguration cConf = CConfiguration.create();
    // cConf.clear();
    // cConf.addResource(inputStream);
    // new LogPipelineLoader(cConf).validate();
    ClassLoader classLoader = new URLClassLoader(urls.toArray(new URL[urls.size()]), null);

    Class<?> cConfClass = classLoader.loadClass(CConfiguration.class.getName());
    Object cConf = cConfClass.getMethod("create").invoke(null);
    cConfClass.getMethod("clear").invoke(cConf);

    InputStream input = new ByteArrayInputStream(writer.toString().getBytes(StandardCharsets.UTF_8));
    cConfClass.getMethod("addResource", InputStream.class).invoke(cConf, input);

    Class<?> loaderClass = classLoader.loadClass(LogPipelineLoader.class.getName());
    Object loader = loaderClass.getConstructor(cConfClass).newInstance(cConf);

    try {
      loaderClass.getMethod("validate").invoke(loader);
    } catch (InvocationTargetException e) {
      // Translate the exception throw by the reflection call
      Throwable cause = e.getCause();
      // Because the "InvalidPipelineException" throw from the reflection call is actually loaded by a different
      // classloader, we need to recreate a new one with the current classloader using the original cause
      // and stacktrace to allow easy debugging.
      // From the perspective of the caller to this method, it doesn't see any classloader trick being done in here.
      // Ideally we should do it for any cause class that is loaded from the classloader constructed above, but
      // that would make the code unnecessarily complicate since we know that only InvalidPipelineException
      // will be throw from the validate method.
      if (InvalidPipelineException.class.getName().equals(cause.getClass().getName())) {
        InvalidPipelineException ex = new InvalidPipelineException(cause.getMessage(), cause.getCause());
        ex.setStackTrace(cause.getStackTrace());
        throw ex;
      }
      Throwables.propagateIfPossible(cause, Exception.class);
      throw new RuntimeException(cause);
    }

    LOG.info("Log pipeline configurations verified.");
  }
