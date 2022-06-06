@Override
    public void onWebSocketText(String message) {
        if (isPing(message)) {
            sendPong();
            return;
        }

        if (isStop(message)) {
            stopTail();
            return;
        }

        Matcher m = TAIL_COMMAND.matcher(message);

        if (!m.matches()) {
            logger.warn("Unsupported command format '" + message + "', must match " + TAIL_COMMAND.pattern() + ", ignoring the command.");
            return;
        }

        try {
            File file = resolveLogFile(m.group("path"));
            if (file == null) {
                return;
            }

            float fractionOfMegabyteToRead = toFloat(m.group("amount"));
            long bytesToTail = round(fractionOfMegabyteToRead * 1024L * 1024L);

            Mode mode = "tail".equals(m.group("mode")) ? TAIL : FOLLOW;
            tail(file, bytesToTail, mode);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
