public static void setLogger(@Nullable final Logger logger) {
        if (logger == TI_LOG) {
            throw new IllegalArgumentException(
                    "Recursion warning: You can't use TI_LOG as Logger for TiLog");
        }
        TiLog.logger = logger;
    }
