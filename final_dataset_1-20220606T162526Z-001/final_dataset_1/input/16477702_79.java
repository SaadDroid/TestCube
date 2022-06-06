public Date getTime() {
        if (utc == null) {
            return null;
        }
        Date date = null;
        try {
            date = XmppDateTime.parseDate(utc);
        }
        catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Error getting local time", e);
        }
        return date;
    }
