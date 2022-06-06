@Override
    public List<User> findCustomerUsers(UUID tenantId, UUID customerId, TextPageLink pageLink) {
        return DaoUtil.convertDataList(
                userRepository
                        .findUsersByAuthority(
                                fromTimeUUID(tenantId),
                                fromTimeUUID(customerId),
                                pageLink.getIdOffset() == null ? NULL_UUID_STR : fromTimeUUID(pageLink.getIdOffset()),
                                Objects.toString(pageLink.getTextSearch(), ""),
                                Authority.CUSTOMER_USER,
                                new PageRequest(0, pageLink.getLimit())));

    }
