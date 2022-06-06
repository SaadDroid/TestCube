@Override
    public String getDiscriminatingValue(ILoggingEvent event) {
        String loggerName = event.getLoggerName()
                .split(Constants.EQUAL_SIGN)[1];
        String prefix = LoggerUtils.TASK_LOGGER_INFO_PREFIX + "-";
        if (loggerName.startsWith(prefix)) {
            return loggerName.substring(prefix.length(),
                    loggerName.length() - 1).replace("-","/");
        } else {
            return "unknown_task";
        }
    }
