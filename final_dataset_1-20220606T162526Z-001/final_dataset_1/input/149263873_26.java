@SuppressWarnings("unchecked")
    @Nonnull
    public static <E> QueryElement<?> applyPageable(@Nonnull final Class<E> domainClass,
                                                    @Nonnull final QueryElement<?> baseQuery,
                                                    @Nonnull final Pageable pageable) {
        Assert.notNull(domainClass, "domainClass must not be null!");
        Assert.notNull(baseQuery, "baseQuery must not be null!");
        Assert.notNull(pageable, "pageable must not be null!");

        if (pageable.isUnpaged()) {
            return baseQuery;
        }

        log.trace("Apply paging, domainClass={}, pageable={}", domainClass.getSimpleName(), pageable);

        QueryElement<?> query = baseQuery;

        if (pageable.getSort().isSorted()) {
            query = applySort(domainClass, query, pageable.getSort());
        }
        if (pageable.getPageSize() > 0 && query.getLimit() == null) {
            query = unwrap(query.limit(pageable.getPageSize()));
        }
        if (pageable.getOffset() > 0 && query.getOffset() == null) {
            query = unwrap(query.offset((int) pageable.getOffset()));
        }

        return query;
    }
