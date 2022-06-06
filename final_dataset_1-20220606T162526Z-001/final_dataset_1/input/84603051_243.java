@Override
    public boolean isValid(ClusterNode localNode) {
        try (Connection conn = ds.getConnection()) {
            boolean valid = conn.isValid(timeout);

            if (valid) {
                if (DEBUG) {
                    log.debug("JDBC reachability check successful [datasource={}]", ds);
                }
            } else {
                if (log.isWarnEnabled()) {
                    log.warn("JDBC reachability check failed [datasource={}, timeout={}]", ds, timeout);
                }
            }

            return valid;
        } catch (SQLException e) {
            if (log.isWarnEnabled()) {
                log.warn("JDBC reachability check failed [datasource={}, timeout={}, cause={}]", ds, timeout, e.toString());
            }

            return false;
        }
    }
