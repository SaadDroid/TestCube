public String translatePrimaryID(String primaryID, String siteID) {
        return update(new ResolvedServer(primaryID, siteID)).getPrimaryID();
    }
