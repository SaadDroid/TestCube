public static final ContentReference fromDeploymentName(String name, String hash) {
        return new ContentReference(PathAddress.pathAddress(PathElement.pathElement(DEPLOYMENT, name)).toCLIStyleString(),
                hash);
    }
