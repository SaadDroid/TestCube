public String build() throws AtlasBaseException {
        StringBuilder queryBuilder = new StringBuilder();
        boolean       isAndNeeded  = false;

        if (queryString != null ) {
            if (LOG.isDebugEnabled()) {
                LOG.debug("Initial query string is {}.", queryString);
            }

            queryBuilder.append("+").append(queryString.trim()).append(" ");

            isAndNeeded = true;
        }

        if (excludeDeletedEntities) {
            if (isAndNeeded) {
                queryBuilder.append(" AND ");
            }

            dropDeletedEntities(queryBuilder);

            isAndNeeded = true;
        }

        if (CollectionUtils.isNotEmpty(entityTypes)) {
            if (isAndNeeded) {
                queryBuilder.append(" AND ");
            }

            buildForEntityType(queryBuilder);

            isAndNeeded = true;
        }

        if (criteria != null) {
            StringBuilder attrFilterQueryBuilder = new StringBuilder();

            withCriteria(attrFilterQueryBuilder, criteria);

            if (attrFilterQueryBuilder.length() != 0) {
                if (isAndNeeded) {
                    queryBuilder.append(" AND ");
                }

                queryBuilder.append(" ").append(attrFilterQueryBuilder.toString());
            }
        }

        return queryBuilder.toString();
    }
