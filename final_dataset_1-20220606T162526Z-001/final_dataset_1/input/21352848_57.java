public boolean writeFile(String fn) {
    try {
      OutputStream out = new FileOutputStream(fn);
      writeObject(out);
    } catch (Exception e) {
      e.printStackTrace();
      return false;
    }
    return true;
  }
