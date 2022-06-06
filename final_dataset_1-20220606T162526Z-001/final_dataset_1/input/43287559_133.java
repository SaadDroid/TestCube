public static boolean areRightLinksConsistent(CalendarHashChain calendarHashChain1,
                                                  CalendarHashChain calendarHashChain2) {
        notNull(calendarHashChain1, "CalendarHashChain");
        notNull(calendarHashChain2, "CalendarHashChain");
        List<CalendarHashChainLink> rightLinks1 = getRightLinks(calendarHashChain1);
        List<CalendarHashChainLink> rightLinks2 = getRightLinks(calendarHashChain2);
        if (rightLinks1.size() != rightLinks2.size()) {
            logger.info("Calendar hash chains have different amount of right links: {} vs {}",
                    rightLinks1.size(), rightLinks2.size());
            return false;
        }

        for (int i = 0; i < rightLinks2.size(); i++) {
            CalendarHashChainLink link1 = rightLinks2.get(i);
            CalendarHashChainLink link2 = rightLinks1.get(i);
            if (!link1.getDataHash().equals(link2.getDataHash())) {
                logger.info("Calendar hash chain right links do not match at right link number {}", i + 1);
                return false;
            }
        }
        return true;
    }
