public int getRetentionPeriodHours() {
        return getInt(
                this,
                BKDL_RETENTION_PERIOD_IN_HOURS,
                BKDL_RETENTION_PERIOD_IN_HOURS_OLD,
                getInt(defaultConfig,
                        BKDL_RETENTION_PERIOD_IN_HOURS,
                        BKDL_RETENTION_PERIOD_IN_HOURS_OLD,
                        BKDL_RETENTION_PERIOD_IN_HOURS_DEFAULT)
        );
    }
