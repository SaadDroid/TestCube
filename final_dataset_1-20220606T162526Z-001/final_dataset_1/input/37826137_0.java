public void updateNotificationsFromServer(UpdatePolicy updatePolicy, final NotificationLoaderFinishListener listener) {
        if (updatePolicy == null) {
            throw new IllegalArgumentException("updatePolicy must not be null");
        }

        Date date = preferenceStore.getLastServerUpdate();
        boolean shouldUpdate = updatePolicy.shouldUpdate(date);
        Log.v(TAG, "UpdatePolicy: " + updatePolicy.toString() + ", shouldUpdate: " + shouldUpdate);
        if (!shouldUpdate) {
            return;
        }

        boolean updateRunning = notificationUpdateRunning.getAndSet(true);
        if (updateRunning) {
            Log.w(TAG, "Notification update already running, skipping this update");
            return;
        }

        NotificationLoaderFinishListener internalListener = new NotificationLoaderFinishListener() {
            @Override
            public void onDownloadFinished(Set<UserNotification> notifications) {
                Log.v(TAG, "Received " + notifications.size() + " notifications");
                handleNotificationsFromServer(notifications);
                notificationUpdateRunning.set(false);
                preferenceStore.saveLastServerUpdate(new Date());
                if (scheduledShowEvent.getAndSet(false)) {
                    Log.v(TAG, "executing scheduled show event");
                    showPendingNotificationsToUser(scheduledShowEventParameter);
                }

                // Call custom listener
                if (listener != null) {
                    listener.onDownloadFinished(notifications);
                }
            }
        };
        NotificationLoaderTask notificationLoaderTask = new NotificationLoaderTask(serverUrl, internalListener);
        notificationLoaderTask.execute();
    }
