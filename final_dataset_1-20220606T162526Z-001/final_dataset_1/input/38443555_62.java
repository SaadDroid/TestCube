public static Stream<Notification> setUnseenState(
      final Iterable<Notification> notifications, final boolean unseen) {

    return StreamSupport.stream(notifications.spliterator(), false)
        .map(notification -> Notification.builder(notification).withUnseen(unseen).build());
  }
