public boolean takeBean() {
        boolean success = false;
        try {
            lock.acquire();
            success = beans > 0;
            if (success) {
                beans = beans - 1;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.release();
        }

        return success;
    }
