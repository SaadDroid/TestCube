public void setNotifications(List<NotifCard> notifs, boolean notify) {
        updateList(notifications, notifs, this::findNotificationOffset, notify);
    }
