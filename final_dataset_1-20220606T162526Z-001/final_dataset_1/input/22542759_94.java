public static int permissionsToUmask(int permissions) {
    // the umask contains exactly the bits that the permissions don't have
    return permissions ^ 0777; // note this is octal
  }
