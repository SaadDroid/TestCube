@Override
    public SessionOperations getOperation(Session session) {
        if (isClientSide(session)) {
            return logAndWrap(session, clientSide, SessionMonitorType.STATELESS);
        }

        if (isLocalServer(session)) {
            return logAndWrap(session, local, SessionMonitorType.LOCAL);
        }

        if (service.isSessionFailoverEnabled()) {

            // If cross talk is reduced... by this point, we know the session is remote.
            // We get CTS to do the legwork for us, knowing that CTSOperations will delegate
            // to RemoteOperations.
            //
            if (service.isReducedCrossTalkEnabled()) {
                return logAndWrap(session, cts, SessionMonitorType.CTS);
            }

            // Remote Site which is known to be down
            if (!isLocalSite(session) && !isSiteUp(getSiteId(session))) {
                return logAndWrap(session, cts, SessionMonitorType.CTS);
            }
        }

        return logAndWrap(session, remote, SessionMonitorType.REMOTE);
    }
