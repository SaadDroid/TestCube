@Override
    public void deleteLedgerLayout() throws IOException {
        try {
            zk.delete(ledgersLayout, -1);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IOException(e);
        } catch (KeeperException e) {
            throw new IOException(e);
        }
    }
