static String extractPackageName(Map<String, String> downloadedDependencies, Matcher matcher, String packageName, MutableBoolean expectingPackageFilePath, Log logger) {
        if (expectingPackageFilePath.isTrue()) {
            // This may occur when a package-installation file is saved in pip-cache-dir, thus not being downloaded during the installation.
            // Re-running pip-install with 'no-cache-dir' fixes this issue.
            logger.debug(String.format("Could not resolve download path for package: %s, continuing...", packageName));
            // Save package with empty file path.
            downloadedDependencies.put(StringUtils.lowerCase(packageName), "");
        }

        // Save dependency info.
        expectingPackageFilePath.setTrue();
        return matcher.group(1);
    }
