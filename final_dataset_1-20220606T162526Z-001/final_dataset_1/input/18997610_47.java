public static String buildUrl(String rootPath, String relativePath) {
        String[] rootPathParts = rootPath.split("/");
        String [] relPathParts = relativePath.split("/");

        if(rootPath == null || relativePath == null) {
            return null;
        }

        int trimRoot = 0;
        int trimRel = 0;

        if(!"".equals(rootPathParts[rootPathParts.length - 1])) {
            trimRoot = 1;
        }
        if("".equals(relPathParts[0])) {
            trimRel = 1; trimRoot = rootPathParts.length-3;
        }        
        for(int i = 0; i < rootPathParts.length; i++) {
            if("".equals(rootPathParts[i])) {
                trimRel += 1;
            }
            else {
                break;
            }
        }
        for(int i = 0; i < relPathParts.length; i ++) {
            if(".".equals(relPathParts[i])) {
                trimRel += 1;
            }
            else if ("..".equals(relPathParts[i])) {
                trimRel += 1; trimRoot += 1;
            }
        }

        String [] outputParts = new String[rootPathParts.length + relPathParts.length - trimRoot - trimRel];
        System.arraycopy(rootPathParts, 0, outputParts, 0, rootPathParts.length - trimRoot);
        System.arraycopy(relPathParts,
                trimRel,
                outputParts,
                rootPathParts.length - trimRoot,
                relPathParts.length - trimRel);

        return StringUtils.join(outputParts, "/");
    }
