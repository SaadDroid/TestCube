public static void validatePath(String path, boolean isSequential) throws IllegalArgumentException {
         validatePath(isSequential ? path + "1" : path);
     }
