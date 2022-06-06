public String[] splitSemanticVersion() throws Exception {
        List<String> versionParts = new ArrayList<>();
        String versionPrefix = "";
        // pre-release or build.
        String versionSuffix = "";
        // for example: beta.2.1
        String[] preVersionParts;

        // Contains white spaces
        if (version.contains(" ") || isValidBuildMetadata()) {   // log and throw error
            throw new Exception("Invalid Semantic Version.");
        }

        if (isBuild() || isPreRelease()) {
            String[] partialVersionParts = version.split(isPreRelease() ?
                PRE_RELEASE_SEPERATOR : BUILD_SEPERATOR, 2);

            if (partialVersionParts.length <= 1) {
                // throw error
                throw new Exception("Invalid Semantic Version.");
            }
            // major.minor.patch
            versionPrefix = partialVersionParts[0];

            versionSuffix = partialVersionParts[1];

        } else {
            versionPrefix = version;
        }

        preVersionParts = versionPrefix.split("\\.");

        if (preVersionParts.length > 3 ||
            preVersionParts.length == 0 ||
            dotCount(versionPrefix) >= preVersionParts.length) {
            // Throw error as pre version should only contain major.minor.patch version
            throw new Exception("Invalid Semantic Version.");
        }

        for (String preVersionPart : preVersionParts) {
            if (parseNumeric(preVersionPart) == null) {
                throw new Exception("Invalid Semantic Version.");
            }
        }

        Collections.addAll(versionParts, preVersionParts);
        if (!stringIsNullOrEmpty(versionSuffix)) {
            versionParts.add(versionSuffix);
        }

        return versionParts.toArray(new String[0]);
    }
