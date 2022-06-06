public List<MenuItem> createMenuItems() {
    if (mc.getDirectories() == null) {
      return Collections.emptyList();
    }
    List<IDirectory> dirs = mc.getDirectories();

    if (dirs != null) {
      for (IDirectory item : dirs) {
        if (isImplemented(item)) {
          boolean musicEnabled = preferences.getBoolean("plex_music_library", false);
          if (musicEnabled == false && "artist".equals(item.getType())) {
            continue;
          }

          MenuItem m = new MenuItem();
          m.setTitle(item.getTitle());
          m.setType(item.getType());

          m.setSection(item.getKey());
          menuItems.add(m);
        }
      }
    }

    if (!menuItems.isEmpty()) {
      menuItems.add(createSearchMenu());
    }

    menuItems.add(createSettingsMenu());
    menuItems.add(createOptionsMenu());

    return menuItems;
  }
