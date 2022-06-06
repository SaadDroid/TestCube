public static String rebaseSplitPath(String srcBase, String srcPath, String dstBase) throws FileUtilsException {
        String[] srcBaseArr = splitPath(srcBase);
        String[] srcPathArr = splitPath(srcPath);
        String[] dstBaseArr = splitPath(dstBase);
        String[] rebasedPath = rebaseSplitPath(srcBaseArr, srcPathArr, dstBaseArr);
        String rebasePathString = splitPathToString(rebasedPath);
        return rebasePathString;
    }
