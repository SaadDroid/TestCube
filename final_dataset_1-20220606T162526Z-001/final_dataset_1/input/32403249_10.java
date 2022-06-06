public String repoPath(boolean forJar) {
        char delim = File.separatorChar;

        if (forJar) {
            delim = '/';
        }

        String[] groupParts = this.groupId.split("\\.");

        StringBuffer p = new StringBuffer();

        for (String groupPart : groupParts) {
            p.append(groupPart)
                    .append(delim);
        }

        p.append(this.artifactId)
                .append(delim);

        p.append(this.version)
                .append(delim);

        p.append(this.artifactId)
                .append('-')
                .append(this.version);

        if (this.classifier != null) {
            p.append('-')
                    .append(this.classifier);
        }

        p.append('.').append(this.type);

        return p.toString();
    }
