public static FromMatchesFilter create(Jid address) {
        return new FromMatchesFilter(address, address != null ? address.hasNoResource() : false) ;
    }
