static XPathFactory build(boolean useSaxon) {
    if (useSaxon) {
      for (String clazz : SAXON_XPATH_FACTORIES) {
        try {
          return (XPathFactory) Class.forName(clazz).newInstance();
        } catch (Exception e) {
          
        }
      }
    }
    return XPathFactory.newInstance();
  }
