int findThisDevicePos() {
        return notifications.size()
                + ((folderHeader != null) ? 1 : 0)
                + folderItems.size()
                + ((deviceHeader != null) ? 1 : 0)
                ;
    }
