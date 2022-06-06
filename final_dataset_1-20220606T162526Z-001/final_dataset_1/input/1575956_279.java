public static String validateAndNormalizeName(String logName)
            throws InvalidStreamNameException {
        if (isReservedStreamName(logName)) {
            throw new InvalidStreamNameException(logName, "Log Name is reserved");
        }

        if (logName.charAt(0) == '/') {
            validatePathName(logName);
            return logName.substring(1);
        } else {
            validatePathName("/" + logName);
            return logName;
        }
    }
