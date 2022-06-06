public List<StockMovementItem> queryStockItemsByCreatedDate(final long stockCardId, final Date periodBeginDate, final Date periodEndDate) throws LMISException {
        return dbUtil.withDao(StockMovementItem.class, dao -> dao.queryBuilder()
                .orderBy("movementDate", true)
                .orderBy("createdTime", true)
                .where()
                .eq("stockCard_id", stockCardId)
                .and().gt("createdTime", periodBeginDate)//difference from the api above
                .and().le("createdTime", periodEndDate)
                .query());
    }
