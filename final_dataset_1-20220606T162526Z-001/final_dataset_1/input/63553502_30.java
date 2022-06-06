public static boolean isAbsolutePath(@Nonnull String path) {
        if (isWindows(path)) {
            if (path.length() > 3 && path.charAt(1) == ':' && path.charAt(2) == '\\') {
                // windows path such as "C:\path\to\..."
                return true;
            } else // Microsoft Windows UNC mount ("\\myserver\myfolder")
                if (path.length() > 3 && path.charAt(1) == ':' && path.charAt(2) == '/') {
                // nasty windows path such as "C:/path/to/...". See JENKINS-44088
                return true;
            } else return path.length() > 2 && path.charAt(0) == '\\' && path.charAt(1) == '\\';
        } else {
            // see java.io.UnixFileSystem.prefixLength()
            return path.charAt(0) == '/';
        }

    }
