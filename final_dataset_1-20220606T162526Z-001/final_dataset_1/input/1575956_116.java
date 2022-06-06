public static boolean initBookie(ServerConfiguration conf) throws Exception {
        /*
         * make sure that journalDirs, ledgerDirs and indexDirs are empty
         */
        File[] journalDirs = conf.getJournalDirs();
        if (!validateDirectoriesAreEmpty(journalDirs, "JournalDir")) {
            return false;
        }

        File[] ledgerDirs = conf.getLedgerDirs();
        if (!validateDirectoriesAreEmpty(ledgerDirs, "LedgerDir")) {
            return false;
        }

        File[] indexDirs = conf.getIndexDirs();
        if (indexDirs != null) {
            if (!validateDirectoriesAreEmpty(indexDirs, "IndexDir")) {
                return false;
            }
        }

        return runFunctionWithRegistrationManager(conf, rm -> {
            try {
                /*
                 * make sure that there is no bookie registered with the same
                 * bookieid and the cookie for the same bookieid is not existing.
                 */
                BookieId bookieId = Bookie.getBookieId(conf);
                if (rm.isBookieRegistered(bookieId)) {
                    LOG.error("Bookie with bookieId: {} is still registered, "
                        + "If this node is running bookie process, try stopping it first.", bookieId);
                    return false;
                }

                try {
                    rm.readCookie(bookieId);
                    LOG.error("Cookie still exists in the ZK for this bookie: {}, try formatting the bookie", bookieId);
                    return false;
                } catch (BookieException.CookieNotFoundException nfe) {
                    // it is expected for readCookie to fail with
                    // BookieException.CookieNotFoundException
                }
                return true;
            } catch (Exception e) {
                throw new UncheckedExecutionException(e.getMessage(), e);
            }
        });
    }
