public void triggerVerificationIfNecessary() {
        final Session session = sessionManager.getActiveSession();
        final long currentTime = time.getCurrentTimeMillis();
        final boolean startVerification = session != null &&
                monitorState.beginVerification(currentTime);
        if (startVerification) {
            executorService.submit(this::verifyAll);
        }
    }
