public Location getLocationByUuid(String uuid) throws LocationLoadException {
        try {
            return locationService.getLocationByUuid(uuid);
        } catch (IOException e) {
            throw new LocationLoadException(e);
        }
    }
