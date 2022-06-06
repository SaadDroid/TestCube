@Override
  public boolean isThisSyntax(String message) throws ServiceException {
    boolean rc = true;

    try {
      Document d = createDocument(message);
      if (d == null) {
        return false;
      }
      XPath xp = createXPath();
      for (String xpath : getPatterns()) {
        Object result = null;
        if (resolveAsNodeset()) {
          result = xp.selectNodeList(d, xpath);
        }
        else {
          result = xp.selectSingleNode(d, xpath);
        }
        if (result == null) {
          rc = false;
          break;
        }
      }
    }
    catch (Exception e) {
      throw new ServiceException(e);
    }
    return rc;
  }
