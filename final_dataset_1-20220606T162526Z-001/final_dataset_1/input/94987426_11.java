@Decision(HANDLE_OK)
    public List<User> handleOk(UserSearchParams params, UserPermissionPrincipal principal, EntityManager em) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<User> query = cb.createQuery(User.class);
        query.distinct(true);
        Root<User> userRoot = query.from(User.class);
        userRoot.fetch("userProfileValues");
        query.orderBy(cb.asc(userRoot.get("id")));

        List<ResourceField> embedEntities = some(params.getEmbed(), embed -> new ResourceFilter().parse(embed))
                .orElse(Collections.emptyList());
        EntityGraph<User> userGraph = em.createEntityGraph(User.class);
        userGraph.addAttributeNodes("account", "userProfileValues");
        Subgraph<UserProfileValue> userProfileValuesGraph = userGraph.addSubgraph("userProfileValues");
        userProfileValuesGraph.addAttributeNodes("value", "userProfileField");
        userProfileValuesGraph.addSubgraph("userProfileField").addAttributeNodes("id", "name", "jsonName");

        List<Predicate> predicates = new ArrayList<>();
        if (params.getGroupId() != null) {
            Join<User, Group> groups = userRoot.join("groups");
            predicates.add(cb.equal(groups.get("id"), params.getGroupId()));
        }

        if (!principal.hasPermission("any_user:read")) {
            Join<User, ?> groups = userRoot.getJoins().stream().filter(j -> j.getModel().getBindableJavaType() == Group.class)
                    .findAny()
                    .orElseGet(() -> userRoot.join("groups"));
            Join users = groups.join("users");
            predicates.add(cb.notEqual(groups.get("name"), "BOUNCR_USER"));
            predicates.add(cb.equal(users.get("id"), principal.getId()));
        }

        Optional.ofNullable(params.getQ())
                .ifPresent(q -> {
                    String likeExpr = "%" + q.replaceAll("%", "_%") + "%";
                    predicates.add(cb.like(userRoot.get("account"), likeExpr, '_'));
                });

        if (!predicates.isEmpty()) {
            query.where(predicates.toArray(Predicate[]::new));
        }

        if (embedEntities.stream().anyMatch(r -> r.getName().equalsIgnoreCase("groups"))) {
            userGraph.addAttributeNodes("groups");
            userGraph.addSubgraph("groups").addAttributeNodes("name");
        }
        return em.createQuery(query)
                .setHint("javax.persistence.cache.storeMode", CacheStoreMode.REFRESH)
                .setHint("javax.persistence.fetchgraph", userGraph)
                .setFirstResult(params.getOffset())
                .setMaxResults(params.getLimit())
                .getResultList();
    }
