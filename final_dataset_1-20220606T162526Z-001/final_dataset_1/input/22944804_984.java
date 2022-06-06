@Override
    public String getSiteID() {
        SessionIDCorrector corrector = query.getSessionIDCorrector();
        if (corrector == null) { // WebtopNaming not yet configured.
            return delegate.getSiteID();
        }
        return corrector.translateSiteID(delegate.getPrimaryID(), delegate.getSiteID());
    }
