@Override
    public void rollback() {
        try {
            for (RDFBeanTransaction tx : transactions) {
                tx.rollback();
            }
        } finally {
            connection.cleanUpAfterCommit();
        }

    }
