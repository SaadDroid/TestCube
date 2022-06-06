@Override
    public boolean matches(String s1, String s2) throws MatchException {
        boolean matches = false;
        numCalls++;
        if (StringUtils.isEmpty(s1) && StringUtils.isEmpty(s2)) return true;
        if (StringUtils.isNotEmpty(s1) && StringUtils.isNotEmpty(s2)) {
            matches = s1.equals(s2);
            if (!matches){
                logger.trace("Testing ld({}, {})", s1, s2);
                int shorter = Math.min(s1.length(), s2.length());
                int longer = Math.max(s1.length(), s2.length());
                if ((longer - shorter) > maxDistance)
                    matches = false;
                else {
                    int distance = calculateLevenshtein(s1, s2).intValue();
                    matches = (distance <= maxDistance);
                }
            }
        }
        if (this.getDictionary() != null && matches) {
            matches = doFalsePositiveCheck(s1,s2);
        }
        return matches;
    }
