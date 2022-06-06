public synchronized boolean advance(long lssn, long entryId) {
        if (lssn == this.lssn) {
            if (entryId <= this.entryId) {
                return false;
            }
            this.entryId = entryId;
            return true;
        } else if (lssn > this.lssn) {
            this.lssn = lssn;
            this.entryId = entryId;
            return true;
        } else {
            return false;
        }
    }
