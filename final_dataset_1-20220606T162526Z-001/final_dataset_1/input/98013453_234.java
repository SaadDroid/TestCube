@VisibleForTesting
    static void notifyEntitiesInternal(List<HookNotification> messages, int maxRetries, UserGroupInformation ugi,
                                       NotificationInterface notificationInterface,
                                       boolean shouldLogFailedMessages, FailedMessagesLogger logger) {
        if (messages == null || messages.isEmpty()) {
            return;
        }

        final int maxAttempts         = maxRetries < 1 ? 1 : maxRetries;
        Exception notificationFailure = null;

        for (int numAttempt = 1; numAttempt <= maxAttempts; numAttempt++) {
            if (numAttempt > 1) { // retry attempt
                try {
                    LOG.debug("Sleeping for {} ms before retry", notificationRetryInterval);

                    Thread.sleep(notificationRetryInterval);
                } catch (InterruptedException ie) {
                    LOG.error("Notification hook thread sleep interrupted");

                    break;
                }
            }

            try {
                if (ugi == null) {
                    notificationInterface.send(NotificationInterface.NotificationType.HOOK, messages);
                } else {
                    PrivilegedExceptionAction<Object> privilegedNotify = new PrivilegedExceptionAction<Object>() {
                        @Override
                        public Object run() throws Exception {
                            notificationInterface.send(NotificationInterface.NotificationType.HOOK, messages);
                            return messages;
                        }
                    };

                    ugi.doAs(privilegedNotify);
                }

                notificationFailure = null; // notification sent successfully, reset error

                break;
            } catch (Exception e) {
                notificationFailure = e;

                LOG.error("Failed to send notification - attempt #{}; error={}", numAttempt, e.getMessage());
            }
        }

        if (notificationFailure != null) {
            if (shouldLogFailedMessages && notificationFailure instanceof NotificationException) {
                final List<String> failedMessages = ((NotificationException) notificationFailure).getFailedMessages();

                for (String msg : failedMessages) {
                    logger.log(msg);
                }
            }

            LOG.error("Giving up after {} failed attempts to send notification to Atlas: {}", maxAttempts, messages.toString(), notificationFailure);
        }
    }
