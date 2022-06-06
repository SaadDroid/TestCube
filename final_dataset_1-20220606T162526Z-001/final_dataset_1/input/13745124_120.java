@Override
  public ParseResult parsePath(String path) {
    String original = path;
    path = path.replace('/', '\\');

    if (WORKING_DIR_WITH_DRIVE.matcher(path).matches()) {
      throw new InvalidPathException(
          original,
          "Jimfs does not currently support the Windows syntax for a relative path "
              + "on a specific drive (e.g. \"C:foo\\bar\")");
    }

    String root;
    if (path.startsWith("\\\\")) {
      root = parseUncRoot(path, original);
    } else if (path.startsWith("\\")) {
      throw new InvalidPathException(
          original,
          "Jimfs does not currently support the Windows syntax for an absolute path "
              + "on the current drive (e.g. \"\\foo\\bar\")");
    } else {
      root = parseDriveRoot(path);
    }

    // check for root.length() > 3 because only "C:\" type roots are allowed to have :
    int startIndex = root == null || root.length() > 3 ? 0 : root.length();
    for (int i = startIndex; i < path.length(); i++) {
      char c = path.charAt(i);
      if (isReserved(c)) {
        throw new InvalidPathException(original, "Illegal char <" + c + ">", i);
      }
    }

    Matcher trailingSpaceMatcher = TRAILING_SPACES.matcher(path);
    if (trailingSpaceMatcher.find()) {
      throw new InvalidPathException(original, "Trailing char < >", trailingSpaceMatcher.start());
    }

    if (root != null) {
      path = path.substring(root.length());

      if (!root.endsWith("\\")) {
        root = root + "\\";
      }
    }

    return new ParseResult(root, splitter().split(path));
  }
