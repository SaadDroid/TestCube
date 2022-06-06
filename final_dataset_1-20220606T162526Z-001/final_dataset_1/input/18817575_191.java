public boolean hasHandlerFor(HttpServletRequest request) {
        if (request == null) {
            throw new IllegalArgumentException("Method argument request must not be null.");
        }

        if (!this.initialized) {
            return false;
        }

        try {
            return super.getHandler(request) != null;
        } catch (Exception e) {
            throw new RuntimeException("Unable to lookup a handler for " + request + ".", e);
        }
    }
