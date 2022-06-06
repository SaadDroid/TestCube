static List<Match> getAllMatchesFromTarget(Target target) {
        List<Match> matches = new ArrayList<Match>();
        if (target != null) {
            List<AnyOf> anyOfList = target.getAnyOf();
            for (AnyOf anyOf : anyOfList) {
                List<AllOf> allOfList = anyOf.getAllOf();
                for (AllOf allOf : allOfList) {
                    List<Match> matchList = allOf.getMatch();
                    matches.addAll(matchList);
                }
            }
        }
        return matches;
    }
