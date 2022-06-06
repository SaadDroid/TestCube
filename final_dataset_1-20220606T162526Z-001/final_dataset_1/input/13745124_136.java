@Override
  public JimfsPath relativize(Path other) {
    JimfsPath otherPath = checkPath(other);
    if (otherPath == null) {
      throw new ProviderMismatchException(other.toString());
    }

    checkArgument(
        Objects.equals(root, otherPath.root), "Paths have different roots: %s, %s", this, other);

    if (equals(other)) {
      return pathService.emptyPath();
    }

    if (isEmptyPath()) {
      return otherPath;
    }

    ImmutableList<Name> otherNames = otherPath.names;
    int sharedSubsequenceLength = 0;
    for (int i = 0; i < Math.min(getNameCount(), otherNames.size()); i++) {
      if (names.get(i).equals(otherNames.get(i))) {
        sharedSubsequenceLength++;
      } else {
        break;
      }
    }

    int extraNamesInThis = Math.max(0, getNameCount() - sharedSubsequenceLength);

    ImmutableList<Name> extraNamesInOther =
        (otherNames.size() <= sharedSubsequenceLength)
            ? ImmutableList.<Name>of()
            : otherNames.subList(sharedSubsequenceLength, otherNames.size());

    List<Name> parts = new ArrayList<>(extraNamesInThis + extraNamesInOther.size());

    // add .. for each extra name in this path
    parts.addAll(Collections.nCopies(extraNamesInThis, Name.PARENT));
    // add each extra name in the other path
    parts.addAll(extraNamesInOther);

    return pathService.createRelativePath(parts);
  }
