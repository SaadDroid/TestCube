public static String getGroup() throws IOException {
        if (isWindows()) {
            String currentProcUserName = System.getProperty("user.name");
            String result = exeCmd(String.format("net user \"%s\"", currentProcUserName));
            String line = result.split("\n")[22];
            String group = PATTERN.split(line)[1];
            if (group.charAt(0) == '*') {
                return group.substring(1);
            } else {
                return group;
            }
        } else {
            String result = exeCmd("groups");
            if (StringUtils.isNotEmpty(result)) {
                String[] groupInfo = result.split(" ");
                return groupInfo[0];
            }
        }

        return null;
    }
