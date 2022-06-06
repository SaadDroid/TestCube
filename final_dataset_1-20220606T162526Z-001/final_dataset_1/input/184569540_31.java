public void verbose(LogVerboseCategory logVerboseCategory, String message, Object ... params) {
        if (isVerbose && verboseModes != null && verboseModes.contains(logVerboseCategory)) {
            log.info(ansi().fgBright(BLACK).a(prefix).a(format(message, params)).reset().toString());
        }
    }
