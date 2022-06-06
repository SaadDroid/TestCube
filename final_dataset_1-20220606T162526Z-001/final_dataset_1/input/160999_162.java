public String getClientAddress() {
        if (null != peer.cnxnFactory) {
            return formatInetAddr(peer.cnxnFactory.getLocalAddress());
        } else {
            return "";
        }
    }
