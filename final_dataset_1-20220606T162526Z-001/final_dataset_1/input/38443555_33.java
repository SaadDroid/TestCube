@Override
  @Nullable
  public NotificationListObject resolve(final List<NotificationListObject> siblings)
      throws UnresolvedConflictException {

    LOGGER.debug("Found {} siblings", siblings.size());
    siblingCounts.update(siblings.size());
    if (siblings.size() > 1) {

      final Iterator<NotificationListObject> iterator = siblings.iterator();
      final NotificationListObject resolved = iterator.next();
      final Set<String> deletedIds = resolved.getDeletedIds();

      // add all notifications
      while (iterator.hasNext()) {
        final NotificationListObject sibling = iterator.next();
        resolved.addNotifications(sibling.getNotifications());
        deletedIds.addAll(sibling.getDeletedIds());
      }

      // remove deleted notifications
      if (!deletedIds.isEmpty()) {
        LOGGER.debug("IDs to delete: {}", deletedIds);
        removeNotifications(resolved.getNotifications(), deletedIds);
      }

      return resolved;
    } else if (siblings.size() == 1) {

      final NotificationListObject resolved = siblings.get(0);

      // remove deleted notifications
      if (!resolved.getDeletedIds().isEmpty()) {
        LOGGER.debug("IDs to delete: {}", resolved.getDeletedIds());
        removeNotifications(resolved.getNotifications(), resolved.getDeletedIds());
      }

      return resolved;
    } else {
      return null;
    }
  }
