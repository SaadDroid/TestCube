public static Version parseImplementationVersionValue(String rawVersion) {
        final StringTokenizer st = new StringTokenizer(rawVersion, ".", false);
        final int[] versions = new int[3];
        String qualifier = null;

        final Pattern qualifierPattern = Pattern.compile("^(\\d+)(_|-)(.+)$");
        for (int x = 0; x < versions.length; x++) {
            if (st.hasMoreTokens()) {
                final String token = st.nextToken();
                final Matcher matcher = qualifierPattern.matcher(token);
                if (matcher.matches()) {
                    versions[x] = Integer.parseInt(matcher.group(1));
                    qualifier = matcher.group(3);
                    break;
                }
                try {
                    versions[x] = Integer.parseInt(token);
                } catch (NumberFormatException e) {
                    qualifier = token;
                    break;
                }
            }
        }

        return new Version(versions[0], versions[1], versions[2], qualifier);
    }
