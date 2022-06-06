@Override
  public void run() {
    try {
      switch (method) {
        case "get":
          runGet();
          break;
        case "delete":
          runDelete();
          break;
        case "put":
          runPut();
          break;
        case "scan":
          runScan();
          break;
      }
    } catch (IllegalArgumentException e) {
      terminal.println(e.getMessage());
    }
  }
